package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;

    private ArrayList<Contacts> contactslist;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactslist = new ArrayList<Contacts>();


    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is on file");
            return false;
        }
        contactslist.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.contactslist.set(foundPosition, newContact);
        System.out.println("Updated contact");
        return true;
    }

    private int findContact(Contacts contact) {
        return this.contactslist.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i <this.contactslist.size(); i++) {
            Contacts contact = this.contactslist.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(Contacts contact) {
        if (findContact(contact) >= 0) {
            this.contactslist.remove(contact);
            return true;
        }
        return false;
    }


    public String queryContact(Contacts contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }


}
