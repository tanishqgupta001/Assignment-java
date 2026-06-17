package conditional_loops;
import java.util.Scanner;
public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter breadth");
        int breadth=sc.nextInt();
        System.out.println("enter height");
        int hieght=sc.nextInt();

        int Areaoftriangle= 1/2*breadth*hieght;
        System.out.println("Area of triangle  " + Areaoftriangle);

    }
}
