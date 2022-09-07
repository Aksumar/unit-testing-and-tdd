package com.acme.banking.dbo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {
    @Test
    public void shouldThrowExceptionWhenIdIsNotValid(){
        Client dummyClint = new Client(0, "client");
        int illegalId = -1;

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(illegalId, dummyClint, 0));
    }

    @Test
    public void shouldThrowExceptionWhenClientIsNotValid(){
        Client incorrectClient = null;

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(1, incorrectClient, 1));
    }

    @Test
    public void shouldThrowExceptionWhenAmountIsNotValid(){
        Client dummyClint = new Client(0, "client");
        int illegalAmount = -1;

        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(1, dummyClint, illegalAmount));
    }

}