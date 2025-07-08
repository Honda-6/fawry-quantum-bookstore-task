package com.fawry.quantumbookstore.entities.people;

public class Author implements Person {
    private Identity identity;

    public Author(Identity identity) {
        this.identity = identity;
    }
    @Override
    public String getName() {
        return this.identity.getName();
    }
    @Override
    public void setName(String name) {
        this.identity.setName(name);
    }
    public String getEmail() {
        if(this.identity instanceof DigitalIdentity) {
            return ((DigitalIdentity) this.identity).getEmail();
        }
        return "N/A";
    }
    public String getAddress() {
        if(this.identity instanceof DigitalIdentity) {
            return ((DigitalIdentity) this.identity).getAddress();
        }
        return "N/A";
    }
}
