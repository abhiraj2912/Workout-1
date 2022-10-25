import java.util.Scanner;

public class Fibonacci {
    static int n1=0, n2=1,n3=0;
    public static void fib(int x){

        if(x>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fib(x-1);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n =sc.nextInt();
        System.out.print(n1 + " " + n2);
        fib(n-2);
    }
}
