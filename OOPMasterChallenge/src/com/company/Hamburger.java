package com.company;

public class Hamburger {

    public String name;
    public String meat;
    public double price;
    public String breadRollType;
    public String addition1Name;
    public String addition2Name;
    public String addition3Name;
    public String addition4Name;
    public double addition1Price;
    public double addition2Price;
    public double addition3Price;
    public double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.price += addition1Price;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.price += addition2Price;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.price += addition3Price;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition1Name = addition4Name;
        this.price += addition4Price;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }

    public double itemizeHamburger() {
        return Math.round(price * 100.00) / 100.00;
    }


}
