import java.util.Scanner;
// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// 1423. Maximum Points You Can Obtain from Cards
public class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt() ;
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxScore(arr, k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int sumLeft = 0 ;
        int sumRight = 0 ;
        int maxScore = 0 ;
        int i = 0 ;
        int k1 = k ;
        while(k1 > 0){
            sumLeft = sumLeft + cardPoints[i];
            i++;
            k1--;
        }

        maxScore = Math.max(maxScore, sumLeft);

        int j = cardPoints.length - 1 ;
        while(k > 0){
            sumLeft = sumLeft - cardPoints[i - 1];
            i--;
            sumRight = sumRight + cardPoints[j];
            j--; 
            maxScore = Math.max(maxScore, sumLeft + sumRight);
            k--;
        }

        return maxScore ;

    }
}
