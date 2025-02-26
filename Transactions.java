
package com.mycompany.coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private final List<CoffeeItems> items; 
    private final String transactionType;

    // Constructors
    public Transactions(String transactionType) {
        this.items = new ArrayList<>();
        this.transactionType = transactionType;
    }

    // Method to add a coffee item to the transaction
    public void addItem(CoffeeItems item) {
        items.add(item);
    }

    // Method to calculate total with service charge
    public double calculateTotal() {
        double subtotal = 0.0;

        for (CoffeeItems item : items) {
            subtotal += item.getPrice();
        }
 
        //Switch case for the transaction type
        switch (transactionType) {
            case "take-out":
            case "dine-in":
                return subtotal; 
            case "pick-up":
                return subtotal * 1.02;
            case "delivery":
                return subtotal * 1.1;
            default:
                return subtotal;
        }
    }

    // Method to display the transaction made by the user
    public void displayTransaction() {
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Items Ordered:");
        for (CoffeeItems item : items) {
            System.out.println("Flavor: " + item.getFlavor());
            System.out.println("Size: " + item.getSize());
            System.out.println("Price: Php " + item.getPrice());
        }
        System.out.printf("Total Amount: Php %.2f%n", calculateTotal());
    }
}
