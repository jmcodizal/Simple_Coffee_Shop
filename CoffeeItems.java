
package com.mycompany.coffeeshop;

public class CoffeeItems {
    private final String flavor; 
    private final double price;
    private final String size;

   //Constructors
    public CoffeeItems(String flavor, double price, String size) {
        this.flavor = flavor;
        this.price = price; 
        this.size = size;
    }

    // Getter for flavor attributes
    public String getFlavor() {
        return flavor;
    }

    // Getter for price attributes
    public double getPrice() {
        return price;
    }

    // Getter for size attributes
    public String getSize() {
        return size;
    }
}
