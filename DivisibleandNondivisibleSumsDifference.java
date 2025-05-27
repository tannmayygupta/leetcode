import java.util.Scanner;

public class DivisibleandNondivisibleSumsDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        System.out.println(differenceOfSums(n, m));

    }
    public static int differenceOfSums(int n, int m) {

        int sumD = 0 ;
        int sumND = 0 ;
        
        int n1 = 1 ;
        while(n1 <= n){
            
            if(n1 % m != 0){
                sumND += n1 ;
            }
            else{
                sumD += n1 ;
            }
            n1++;
        }
        
        return sumND - sumD ;
    }
}
