import java.util.Scanner;
public class While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=10;
        System.out.println("Enter a num");
    int r =sc.nextInt();
    while(i>=1){
        System.out.println(r+"*"+i+"="+r*i);
        --i;
    }
    }
}
