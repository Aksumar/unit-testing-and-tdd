package com.acme.banking.dbo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.allOf;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.hamcrest.MatcherAssert.assertThat;

class SavingAccountTest {
    @Test
    public void shouldThrowExceptionWhenIdIsNotValid() {
        Client dummyClient = new Client(0, "client");
        int illegalId = -1;

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(illegalId, dummyClient, 0));
    }

    @Test
    public void shouldThrowExceptionWhenClientIsNotValid() {
        Client incorrectClient = null;

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(1, incorrectClient, 1));
    }

    @Test
    public void shouldThrowExceptionWhenAmountIsNotValid() {
        Client dummyClient = new Client(0, "client");
        int illegalAmount = -1;

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(1, dummyClient, illegalAmount));
    }

    @Test()
    public void shouldCreateSavingAccountWhenParametrsValid() {
        Client dummyClient = new Client(0, "client");
        int id = 1;
        int amount = 1;
        SavingAccount savingAccount = new SavingAccount(id, dummyClient, amount);

        assertAll("Correct arguments",
                () -> Assertions.assertEquals(id, savingAccount.getId()),
                () -> Assertions.assertEquals(dummyClient, savingAccount.getClient()),
                () -> Assertions.assertEquals(amount, savingAccount.getAmount())
        );
    }

}