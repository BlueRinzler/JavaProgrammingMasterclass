package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount samBank = new BankAccount("Sam","sam@greg.com",232453.85,123423231,000000000);
        System.out.println(samBank.getBalance());
        System.out.println(samBank.getPhoneNumber());

        BankAccount ryleeAccount = new BankAccount("rylee", "rylle@greg.com",8888888);
        System.out.println(ryleeAccount.getBalance());

        VipCustomer Sam = new VipCustomer();
        System.out.println(Sam.getCreditLimit());


    }
}
