package ex_19122024.CreateArrayNum_StringTypes;
import java.util.Scanner;

public class StringArray_IntArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:\t");
        int size = sc.nextInt();
        //create integer array types
        
        int[] roleno = new int[size];
        System.out.println("Enter any three numbers:\t");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        

        roleno[0] = number1;
        roleno[1] = number2;
        roleno[2] = number3;
        System.out.println("\nrolenumber\n"+roleno[0]+"\n"+roleno[1]+"\n"+roleno[2]);

        //storing names in Array
        sc.nextLine(); // clear the input
        String[] studentNames = new String[size];
        System.out.println("Enter any three names:\t");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();

        studentNames[0] = name1;
        studentNames[1] = name2;
        studentNames[2] = name3;
        System.out.println("\nStudentNames\n");
        System.out.println(studentNames[0]+"\n"+studentNames[1]+"\n"+studentNames[2]);

        sc.close();
        
    }
}
