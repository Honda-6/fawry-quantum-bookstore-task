package com.fawry.quantumbookstore.entities.people;

public class Customer implements Person {
    private DigitalIdentity identity;
    private double balance;

    public Customer(String name, String email, String address, double balance) {
        this.identity = new DigitalIdentity(name, email, address);
        this.balance = balance;
    }
    @Override
    public String getName() {
        return this.identity.getName();
    }
    public void setName(String name) {
        this.identity.setName(name);
    }
    public String getEmail() {
        return this.identity.getEmail();
    }
    public void setEmail(String email) {
        this.identity.setEmail(email); 
    }
    public String getAddress() {
        return this.identity.getAddress();
    }
    public void setAddress(String address) {
        this.identity.setAddress(address);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {  
        this.balance = balance;
    }
}
    
