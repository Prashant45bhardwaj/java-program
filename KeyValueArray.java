import java.util.Scanner;

public class KeyValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] keys = {"Name", "Age", "City"};
        String[] values = new String[keys.length];

        for (int i = 0; i < keys.length; i++) {
            System.out.println("Enter your " + keys[i] + ":");
            values[i] = sc.nextLine();
        }

        System.out.println("Key-Value Pairs:");
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + ": " + values[i]);
        }

        sc.close();
    }
}