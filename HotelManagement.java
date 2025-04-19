import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Star Bucks Cafe!");

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your mobile number:");
        long mobileNumber = sc.nextLong();  // Use long for mobile numbers

        int totalBill = 0;  // To store the total bill amount

        while (true) {
            System.out.println("Sr       ITEM      PRICE");
            System.out.println("1 - >  PIZZA       25");
            System.out.println("2 - >  BURGER      25");
            System.out.println("3 - >  COFFEE      120");
            System.out.println("4 - >  TEA         125");
            System.out.println("5 - >  EXIT");
            System.out.println("Enter Your Choice (S.NO):");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for visiting, " + name + "!");
                System.out.println("Your total bill is: " + totalBill + " Rupees.");
                break;  // Exit the loop
            }

            int price = 0;
            switch (choice) {
                case 1:
                    price = 25;
                    System.out.println("You selected PIZZA. Enter quantity:");
                    break;
                case 2:
                    price = 25;
                    System.out.println("You selected BURGER. Enter quantity:");
                    break;
                case 3:
                    price = 120;
                    System.out.println("You selected COFFEE. Enter quantity:");
                    break;
                case 4:
                    price = 125;
                    System.out.println("You selected TEA. Enter quantity:");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;  // Restart loop if invalid input
            }

            int quantity = sc.nextInt();
            int itemTotal = price * quantity;
            totalBill += itemTotal;

            System.out.println("Added to bill: " + itemTotal + " Rupees");
        }
        System.out.println("\n---Star buck cafe final bill---");
        String Name = "";
        System.out.println("Costumer name:"+Name);
        System.out.println("mobile number:"+mobileNumber);
        System.out.println(" ");
        sc.close();  // Close scanner to prevent memory leak
    }
}