public class NPattern {
    public static void main(String args[]){
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5;col++){
                if(col==1 || (row==col) ||col==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
