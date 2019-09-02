package com.Samuel;

public class VIPCustomer {

    private String name, emailaddress;
    private int creditlimit;

    public VIPCustomer(String name, String emailaddress, int creditlimit) {
        this.name = name;
        this.emailaddress = emailaddress;
        this.creditlimit = creditlimit;
    }

    public VIPCustomer(String name, String emailaddress) {
        this.name = name;
        this.emailaddress = emailaddress;
    }

    public VIPCustomer (){

        this("Default", "example@example.com", 24445);
    }

    public String getName() {
        return name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public int getCreditlimit() {
        return creditlimit;
    }



}
