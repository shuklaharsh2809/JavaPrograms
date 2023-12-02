import java.util.*;
public class GreaterNumber {
    public static int greaterNumber(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int greater=greaterNumber(a,b);
        System.out.println(greater);

    }
}
