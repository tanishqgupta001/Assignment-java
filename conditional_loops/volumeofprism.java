package conditional_loops;
import java.util.Scanner;
public class volumeofprism {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
    System.out.println("enter the base area");
    int Basearea =sc.nextInt();
    System.out.println(" enter hieght");
    int hieght=sc.nextInt();
    int volumeofprism=Basearea * hieght;
    System.out.println(" volume of prism  " + volumeofprism);
    }
   

}
