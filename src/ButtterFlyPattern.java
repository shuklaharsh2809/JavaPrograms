public class ButtterFlyPattern {
    public static void main(String args[]){
        int n=5;
        //Upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            //2nd part
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        //loewr half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            //2nd part
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
