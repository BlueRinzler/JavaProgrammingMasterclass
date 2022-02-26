package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone("450-684-3838")

    public static void main(String[] args) {

        boolean quit = false;

        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:



            }



        }


    }

    public static void startPhone() {
        System.out.println("Phone is on");
    }

    public static void printActions() {
        System.out.println(" 1 - Add contact");
        System.out.println(" 2 - Remove contact");
        System.out.println(" 3 - Update contact");
        System.out.println(" 4 - Find contact");
        System.out.println(" 5 - Turn off phone");
        System.out.println(" 6 - Show actions");

    }

    public static void addContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, number);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("Added contact");
        } else {
            System.out.println("Not added, already found");
        }


    }

    public static void updateContact() {
        System.out.println("Enter old name: ");
        String name = scanner.nextLine();
        System.out.println("Enter old number: ");
        String number = scanner.nextLine();



    }
}

