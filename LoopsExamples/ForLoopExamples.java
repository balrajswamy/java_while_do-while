package ex_19122024.LoopsExamples;

public class ForLoopExamples {
    public static void main(String[] args) {
        // Declare and initialize an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        // Print names using a for loop
        System.out.println("Names in the array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] roleno = {12,24,36,48,60};

        for (int i = 0; i<roleno.length;i++)
        {
            System.out.println("integer array values:\t"+i+"==>"+roleno[i]);
        }
        
        System.out.println("Looping all the elements without initialization");

        for (int i: roleno){
            if (i==36){
                
                break;
            }
            System.out.println("element=>"+i);
        }
    }
}
