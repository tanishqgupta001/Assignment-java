import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the  value of breadth");
        int breadth=sc.nextInt();
        System.out.println("enter the value of heigth");
        int height=sc.nextInt();


        int Areaofparallelogram= breadth*height;
        System.out.println("Area of parallelogram " + Areaofparallelogram);

    }
}
