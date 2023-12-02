public class FiboonacciSeries {
    public static void main(String args[]) {
        int n = 10;
        long firstterm = 0, secondterm = 1;
        System.out.println("FiboonacciSeries");
        for (int i = 0; i < n; i++) {
            System.out.println(firstterm + " ");
            long nextterm = firstterm + secondterm;
           firstterm=secondterm;
           secondterm=nextterm;
        }
    }
}