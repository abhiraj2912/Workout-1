import java.util.Scanner;

public class Perfectsqr {
    public static void main(String [] args) {

        int a,b,sqr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        for(int i=a;i<=b;i++){
            sqr = (int) Math.sqrt(i);
            if(sqr*sqr==i){
                System.out.println(i);
            }
        }
    }
}
