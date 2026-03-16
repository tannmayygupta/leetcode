import java.util.Scanner;
// https://leetcode.com/problems/count-commas-in-range/submissions/1950286047/
// 3870. Count Commas in Range
public class CountCommasinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countCommas(n));
    }

    public static int countCommas(int n) {
        if(n < 1000){
            return 0 ;
        }

        int ans = n - 1000 + 1 ;

        return ans ;
    }
}
