

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] items = {"Pizza", "Burger", "Pasta", "Cold Drink"};
        int[] prices = {200, 100, 150, 50};

        int[] quantity = new int[4];
        int total = 0;

        while (true) {
            System.out.println("\n--- MENU ---");
            for (int i = 0; i < 4; i++) {
                System.out.println(i + " " + items[i] + " - Rs." + prices[i]);
            }
            System.out.println("4 Exit & Print Bill");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                break;
            }

            if (choice < 0 || choice > 3) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            quantity[choice] = quantity[choice] + qty;
            total = total + (prices[choice] * qty);
        }

        // GST
        double gst = total * 0.05;
        double finalBill = total + gst;

        // BILL PRINT (UPDATED 🔥)
        System.out.println("\n******************************");
        System.out.println("     SHIVAM RESTAURANT");
        System.out.println("******************************");
        System.out.println("--------- BILL ---------");

        for (int i = 0; i < 4; i++) {
            if (quantity[i] > 0) {
                System.out.println(items[i] + " x " + quantity[i] +
                        " = Rs." + (quantity[i] * prices[i]));
            }
        }

        System.out.println("------------------------");
        System.out.println("Subtotal: Rs." + total);
        System.out.println("GST (5%): Rs." + gst);
        System.out.println("Total Bill: Rs." + finalBill);
        System.out.println("------------------------");
        System.out.println("Thank You! Visit Again 😊");

        sc.close();
    }
}











