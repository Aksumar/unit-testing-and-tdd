package com.acme.banking.dbo.domain;

public class SavingAccount implements Account {
    private int id;
    private Client client;
    private double amount;

    public SavingAccount(int id, Client client, double amount) {
        checkSavingAccount(id, client, amount);

        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Client getClient() {
        return client;
    }

    private void checkSavingAccount(int id, Client client, double amount) {
        if (id < 0) throw new IllegalArgumentException("Id can not be < 0");
        if (client == null) throw new IllegalArgumentException("Client can not be null");
        if (amount < 0) throw new IllegalArgumentException("Amount can not be  < 0");
    }
}
