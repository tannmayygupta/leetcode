import java.util.Scanner;

public class CountTotalNumberofColoredCells{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        long y = coloredCells(x);

        System.out.println(y);
        
    }
    public static long coloredCells(int n) {
        // 1 , 1+4 , 1+4+8 

        long an = 1 ;
        long d = 4 ;
        long i = 1 ;
        while(i <= n){
            an = an + (i - 1) * d ;
            i++;
        }

        return an ;
        
    }
}