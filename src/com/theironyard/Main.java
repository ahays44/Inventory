package com.theironyard;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void createItem(Scanner scanner, ArrayList<InvItem> items) {
        System.out.println("Enter your new item.");
        String text = scanner.nextLine();
        InvItem item = new InvItem(text, 1);
        items.add(item);
    }

    public static void removeItem(Scanner scanner, ArrayList<InvItem> items) {
        System.out.println("Enter the number of the item you wish to remove.");
        String numStr = scanner.nextLine();
        try {
            int num = Integer.valueOf(numStr);
            InvItem tempItem = items.get(num - 1);
            items.remove(tempItem);
        }
        catch (NumberFormatException e) {
            System.out.println("You didn't type a number!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number isn't valid!");
        }
    }

    public static void updateQuantity(Scanner scanner, ArrayList<InvItem> items) {
        System.out.println("Enter the number of the item you wish you update.");
        String update = scanner.nextLine();
        int up = Integer.valueOf(update);
        InvItem temp = items.get(up - 1);
        System.out.println("What is the new quantity of " + update + "?");


    }

    public static void main(String[] args) {
        ArrayList<InvItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create New item.");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item Quantity .");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    createItem(scanner, items);
                    break;
                case "2":
                    removeItem(scanner, items);
                    break;
                case "3":
                    updateQuantity(scanner, items);
                    break;
                default :
                    System.out.println("Invalid option.");

            }
        }
    }
}