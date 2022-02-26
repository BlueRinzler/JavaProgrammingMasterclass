package com.company;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        if (rightLink != null) {
            return rightLink;
        } else {
            return null;
        }
    }

    @Override
    ListItem setNext(ListItem item) {
        if (item != null) {
            this.rightLink = item;
            return rightLink;
        }
        return null;
    }

    @Override
    ListItem previous() {
        if (leftLink != null) {
            return leftLink;
        }
        return null;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        if (item != null) {
            this.leftLink = item;
            return leftLink;
        }
        return null;
    }


    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
