    // Approach
    // if num is even then we have its return num otherwise return n * 2 >
    // Complexity
    // Time complexity:O(n)
    // Space complexity:O(1)
    
    // 2413. Smallest Even Multiple
    // https://leetcode.com/problems/smallest-even-multiple/description/

import java.util.Scanner;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(smallestEvenMultiple(n));
    }

    public static int smallestEvenMultiple(int n) {

        if(n % 2 == 0){
            return n ;
        }
        else{
            return n *  2 ;
        }
        
    }
}
