import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 =sc.next().toLowerCase();
        String str2 ="";
        int len = str1.length();

        for (int i=len-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }

        if(str1.equals(str2)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");

        }
    }
}
