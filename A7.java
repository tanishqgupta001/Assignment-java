public class A7 {
    public static void main(String[] args) {
        int n=10;
        int firstnumber =0 ;
        int secondnumber =1;
        for(int i=1;i<=n;i++){
            System.out.println( firstnumber + " ,");
            int nextnumber=firstnumber + secondnumber;
            firstnumber= secondnumber;
            secondnumber = nextnumber;
        }
    }
}
