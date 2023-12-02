import java.util.*;
public class EligibleAge {
    public static void eligibleAge(int age){
        if(age>=18){
            System.out.println("eligible to vote");


        }
        else{
            System.out.println("Not eligible to vote");


        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        eligibleAge(age);
    }
}
