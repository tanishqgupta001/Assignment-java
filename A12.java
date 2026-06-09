import java.util.Scanner;
public class A12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();
        System.out.println("enter width");
        int width=sc.nextInt();

        int areaofRectangle = length*width;
        System.out.println("Area of rectangle" + areaofRectangle);
    }
}
