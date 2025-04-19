import java.util.*;
public class opratorshift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("enter the 1st num");
        a=sc.nextInt();
        System.out.println("enter the 2nd num");
        b=sc.nextInt();
        System.out.println(!(a<b)!=(b>a));
    }
}

