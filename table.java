import java.util.Scanner;
public class table{
    static void table(int n ){
        for(int i=1;i<=10;i++){
        System.out.println(n+"*"+i+"="+n*i);
    }
}
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num");
        int num=sc.nextInt ();
        table(num);
}
}                                

