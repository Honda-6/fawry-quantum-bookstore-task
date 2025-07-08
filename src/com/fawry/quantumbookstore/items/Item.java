package com.fawry.quantumbookstore.items;

public interface Item {
    public String getItemId();
    public String getName();
    public double getPrice();
    public void setPrice(double price);
    public State getItemState();
    public void setType(State type);
}
