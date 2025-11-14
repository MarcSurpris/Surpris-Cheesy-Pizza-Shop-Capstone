package com.pluralsight.capstone.app;

import com.pluralsight.capstone.model.Order;

import java.util.Scanner;

// Main Application
public class PizzaShopApp {
    private static Scanner = new Scanner(System.in);
    private static Order currentOrder;

    public static void main(String[] args) {
        // Ensure receipts folder exists, assume it does or create.

        boolean running = true;
        while (running) {
            displayHomeScreen();
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    currentOrder  = new Order();
                    handleOrderScreen();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Exiting application");
    }

    private static void displayHomeScreen() {
        System.out.println("Home Screen");
        System.out.print("1) New Order");
        System.out.println("0) Exit");
    }

    private static void handleOrderScreen() {
        boolean ordering = true;
        while (ordering) {
            displayOrderScreen();
            int choice = getIntInput();
            swtich (choice) {
                case 1:
                    addPizza();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addGarlicKnots();
                    break;
                case 4:
                    checkout();
                    ordering = false;
                    break;
                case 0:
                    currentOrder = null;
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
