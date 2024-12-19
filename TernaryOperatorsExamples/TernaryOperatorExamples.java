package ex_19122024.TernaryOperatorsExamples;
import java.util.Scanner;

public class TernaryOperatorExamples {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check Even or Odd!\t");
        int num = sc.nextInt();
        String result = (num%2==0)? "The given number is Even!": "The given number is Odd!";
        System.out.println("Result:\t"+result);
        sc.close();
    }
}
