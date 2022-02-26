package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;

    }

    public boolean addCustomer(String branch, String name, double transaction) {
        Branch searchBranch = findBranch(branch);
        if (searchBranch != null) {
            return searchBranch.newCustomer(name, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branch, String name, double transaction) {
        Branch searchBranch = findBranch(branch);
        if (searchBranch != null) {
            return searchBranch.addCustomerTransaction(name, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (Customer customer : branchCustomers) {
                System.out.println("Customer: " + customer.getName());
                if (printTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Transactions: ");
                    for (Double transaction : transactions) {
                        System.out.println(transaction);
                    }

                }
            }
            return true;
        } else {
            return false;
        }
    }


    private Branch findBranch(String name) {

        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(name)) {
                //System.out.println("Found " + customer.getName());
                return branch;
            }
        }
        return null;
    }


}
