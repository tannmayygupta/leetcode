import java.util.Scanner;

public class MaximumDifferenceBetweenAdjacentElementsinaCircularArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,4};

        System.out.println(maxAdjacentDistance(arr));

        
        
    }
    public static int maxAdjacentDistance(int[] arr) {
        int sub = Integer.MIN_VALUE ;
        int max = Integer.MIN_VALUE ;
        int ans2 = Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length - 1 ; i++){
                sub = Math.abs(arr[i+1] - arr[i]);
                max = Math.max(sub,max);
        }
        ans2 = Math.abs(arr[arr.length - 1] - arr[0]);
        max = Math.max(ans2,max);

        return max;
    }
}
