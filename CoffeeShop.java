
package com.mycompany.coffeeshop;

import java.util.Scanner;


public class CoffeeShop {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Available list coffee flavors, their prices and sizes
        String[] flavors = {"Mocha", "Americano", "Brewed", "Hazelnut", "Vanilla", "Caramel"};
        double[] prices = {105, 95, 100, 125, 135, 150};
        String[] sizes = {"16oz", "24oz", "32oz", "40oz"};
        

        // Transaction type input
        System.out.println("Select Transaction Type:");
        System.out.println("[1] Take-out");
        System.out.println("[2] Dine-in");
        System.out.println("[3] Delivery");
        System.out.println("[4] Pick-up");
        int transactionChoice = scanner.nextInt();
        String transactionType = "";

        switch (transactionChoice) {
            case 1 -> transactionType = "take-out";
            case 2 -> transactionType = "dine-in";
            case 3 -> transactionType = "pick-up";
            case 4 -> transactionType = "delivery";
            default -> {
                System.out.println("Invalid choice. Enter another transaction type");
                return;
             }
        }

        // Selecting coffee flavor
        System.out.println("Select Coffee Flavor:");
        for (int i = 0; i < flavors.length; i++) {
            System.out.println("[" + (i + 1) + "] " + flavors[i] + " - Php " + prices[i]);
        }
        int flavorChoice = scanner.nextInt() - 1;

        // Selecting coffee size
        System.out.println("Select Size:");
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("[" + (i + 1) + "] " + sizes[i]);
        }
        int sizeChoice = scanner.nextInt() - 1;

        // Input quantity
        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();

        // Creating coffee items
        CoffeeItems coffeeItems = new CoffeeItems(flavors[flavorChoice], prices[flavorChoice] * quantity, sizes[sizeChoice]);
        Transactions transactions = new Transactions(transactionType);
        transactions.addItem(coffeeItems);

        // Displaying transaction details
        transactions.displayTransaction();
        }
}
