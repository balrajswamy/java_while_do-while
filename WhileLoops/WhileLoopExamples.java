package ex_19122024.WhileLoops;

public class WhileLoopExamples {
    public static void main(String[] args) {
        int i = 0;
        int [] roleno = {20,30,50,60,70,90};

        while (i < roleno.length){

            System.out.println("value of "+roleno[i]);

            i=i+1;
        }

        int c = 0;
        do {
            System.out.println("c at do-while value:\t"+c);
            c=c+1;
        } while (c<10);
    }
}
