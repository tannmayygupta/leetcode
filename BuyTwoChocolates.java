import java.util.*;

// https://leetcode.com/problems/buy-two-chocolates/solutions/6891281/2706-buy-two-chocolates/

// 2706. Buy Two Chocolates

// // sort the given prices array
// then ques say buy two chocolate such that you buy 2 choclate and left with max money that is non-negative

public class BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] prices = {1,2,2} ;

        int money = 3 ;

        System.out.println(buyChoco(prices, money));
    }
    public static int buyChoco(int[] prices, int money) {

        int max = Integer.MIN_VALUE ;

        Arrays.sort(prices);

        for(int i = 0 ; i < prices.length - 1 ; i++){
            int sum = prices[i] + prices[i+1];

            if(sum <= money){
                int leftmon = money - sum ;

                if(leftmon >= 0){
                    max = Math.max(max,leftmon);
                }
            }
        }

        if(max == Integer.MIN_VALUE){
            return money ;
        }
        
        return max;
    }
}
