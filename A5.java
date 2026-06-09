import java.util.*;
public class A5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value a");
         int a=sc.nextInt();
         System.out.println("enter the value of b");
         int b=sc.nextInt();

         if(a>b){
            System.out.println(a + " a is largest");
         }
         else{
            System.out.println(b + " b is largest");
         }
    }
}
