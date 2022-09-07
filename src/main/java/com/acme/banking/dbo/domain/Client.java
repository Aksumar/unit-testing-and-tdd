package com.acme.banking.dbo.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    private int id;
    private String name;
    private Collection<Account> accounts = new ArrayList<>(); //TODO

    public Client(int id, String name) {
        checkClient(id, name);

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void checkClient(int id, String name) {
        if (id < 0) throw new IllegalArgumentException("Id can not be < 0");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name can not be null or empty string");
    }
}
