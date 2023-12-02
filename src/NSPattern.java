public class NSPattern {
    public static void main(String args[]){
       for(int row=1;row<=5;row++){
           for(int col=1;col<=5;col++){
               if(col==1 ||((row%2!=0 && row!=5)&& col!=5)|| (row==2 && col==5)){
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
