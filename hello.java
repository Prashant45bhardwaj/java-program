import java.util.Scanner;

public class hello{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number ");
    int r=sc.nextInt();
    for (int i = r+1; i <=10; i++) {
        System.out.println(i);
    }

}
}
