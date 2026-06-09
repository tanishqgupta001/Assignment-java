import java.util.Scanner;
public class A10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the radius");
        double radius= sc.nextDouble();

        double Areaofcircle= 3.14*radius*radius;
        System.out.println("area of circle  " + Areaofcircle);
    }
}
