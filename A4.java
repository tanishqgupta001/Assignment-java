import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println("enter the symbol");
        char operator= sc.next().charAt(0);

        if (operator =='+'){
               System.out.println(a+b + " addition");
        }
        else if(operator=='-'){
            System.out.println(a-b + " subtraction"  );
        }
        else if(operator=='*'){
            System.out.println(a*b + "multiplication");
        }
        else{
            System.out.println(a/b + "division");

        }
       
        


    }
}
