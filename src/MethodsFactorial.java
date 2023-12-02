import java.util.*;
public class MethodsFactorial {
    public static void myFactorial(int n){
        if(n<0){
            System.out.println("Inavalid Input");
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;

        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        myFactorial(n);
    }
}
