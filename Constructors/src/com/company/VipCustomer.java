package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.email = email;
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "generic@generic.com");
    }

    public VipCustomer() {
        this("default", 0000000, "generic@generic.com");
    }

    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
