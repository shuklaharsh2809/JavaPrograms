public class NucleusSoftware {
    public static void main(String args[]){
        // common for all patterns
        int n=5;//row
        int m=9;//col
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==j || i+j==10 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
