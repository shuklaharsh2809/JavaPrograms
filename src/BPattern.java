public class BPattern {
    public static void main(String args[]){
        for(int row=1;row<=5;row++){
            for(int col=1;col<=4;col++){
                if(col==1 || (row%2!=0 && col==2 || col==3)){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
