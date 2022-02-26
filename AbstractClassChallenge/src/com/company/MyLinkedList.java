package com.company;

import org.w3c.dom.Node;

import java.util.List;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            //  list was empty
            this.root = item;
            return true;
        } else {
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison < 0){
                    if (currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(item);
                        item.setPrevious(currentItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    if (currentItem.previous() != null) {
                        currentItem.previous().setNext(item);
                        item.setPrevious(currentItem.previous());
                        item.setNext(currentItem);
                        currentItem.setPrevious(item);
                    } else {
                        item.setNext(this.root);
                        this.root.setPrevious(item);
                        this.root = item;
                    }
                    return true;
                } else {
                    // equal
                    System.out.println("already in list");
                    return false;


                }
            }
        }

    }

    @Override
    public boolean removeItem(ListItem item) {

    }

    @Override
    public void traverse(ListItem root) {

    }
}
