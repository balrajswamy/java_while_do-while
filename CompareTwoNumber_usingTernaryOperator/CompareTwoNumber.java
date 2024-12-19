package ex_19122024.CompareTwoNumber_usingTernaryOperator;
import java.util.Scanner;

public class CompareTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number!\t");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number!\t");
        int num2 = sc.nextInt();
        String result = (num1 > num2)? "Num1 is maximum:\t "+num1: "Num2 is minimum:\t"+num2;
        System.out.println("result:\t"+result);
        sc.close();
    }
}
