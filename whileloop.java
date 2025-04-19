import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int r=sc.nextInt();
        int i=1;
        while(i<=10){
            if(r==5){
                System.out.println(i);
                continue;
            }
            i++;
        }
    }
}
