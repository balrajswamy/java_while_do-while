package ex_19122024.SwitchCaseExamples;
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number t to 2!");

        int day = sc.nextInt();

        switch (day){

            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Invalid day number!");

        }

        sc.close();
        
    }
}
