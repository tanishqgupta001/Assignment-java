import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of p");
       int P=sc.nextInt();
       System.out.println("enter the value of r");
       int R=sc.nextInt();
       System.out.println("enter the value of t");
       int T=sc.nextInt();

       int SI=P*R*T/100;
       System.out.println(SI + "  final value of simple interst");
    }
}
