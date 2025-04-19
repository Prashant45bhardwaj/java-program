import java.util.Scanner;
public class sumoftable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int i;
        for ( i = 1; i <= 10; i++) {
            System.out.print(a + " * " + i + " = " + a * i);

            if ((a * i) % 2 == 0) {
                System.out.println(" (Even)");
            } else {
                System.out.println(" (Odd)");
            }
            sum += a;
            sum1 += i;
            sum2 += (a * i);
        }
        System.out.println(sum + " * "+sum1+" = "+sum2);
    }
  }

