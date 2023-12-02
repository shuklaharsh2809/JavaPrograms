public class FibonaciRecursion {
    public static int Fibonaci(int n){
        if(n<=1) {
            return n;
            } else{
                return Fibonaci(n-1)+Fibonaci(n-2);
            }
        }
      public static void main(String args){
        int n=10;
        for(int i=0;i<=n;i++){
            System.out.println(Fibonaci(i)+"");
          }

    }
}
