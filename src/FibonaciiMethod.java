import java.util.*;
public class FibonaciiMethod {
    public static int fibonaciiSeries(int n){
        if(n<=1){
          return n;
        }
        else{
        return fibonaciiSeries(n-1)+fibonaciiSeries(n-2);

        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(fibonaciiSeries(i)+"");

        }
    }

}
