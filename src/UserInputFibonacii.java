import java.util.Scanner;
public class UserInputFibonacii {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number to print fibonacii");
        int num = Sc.nextInt();
        if (num < 0) {
            System.out.println("Please enter positive number");
        } else {
            System.out.println("Print fibonacii ");
            fibonacii(num);

        }

    }
            public static void fibonacii(int num){
        int firstTerm=0;
        int secondTerm=1;

        for(int i=0;i<num;i++){
            System.out.println(firstTerm+"");

            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;


        }
    }
}
