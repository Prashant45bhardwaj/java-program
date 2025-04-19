import java.util.Scanner;
public class unaRY {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num");
        a = sc.nextInt();
        System.out.println("Enter the second num");
        b = sc.nextInt();
        System.out.println("Addition is" + (a += 2));//4
        System.out.println("Multiplication is" + (a *= b));
        System.out.println("Subtract is" + (a -= b));
        System.out.println("Divition  is" + (a /= b));
    }
}

