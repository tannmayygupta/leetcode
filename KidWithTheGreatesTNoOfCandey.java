import java.util.ArrayList;
import java.util.List;

public class KidWithTheGreatesTNoOfCandey {
    public static void main(String[] args) {
    
                // Example 1:

        //     Input: candies = [2,3,5,1,3], extraCandies = 3
        //     Output: [true,true,true,false,true] 
        //     Explanation: If you give all extraCandies to:
        //     - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
        //     - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        //     - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
        //     - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
        //     - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

        // int[] candies = {2,3,5,1,3};

        // int extraCandies = 3 ;

        int[] candies = {4,2,1,1,2};

        int extraCandies = 1 ;

        int n = candies.length ;

        // boolean[] arr = new boolean[n];

        // converting my boolean array to boolean linkList 

        List<Boolean> arr = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        // methid 1 we can do is that pure array me se ek max value nikal le then we do is that ki agar kid ko e 

        for(int i = 0 ; i < n ; i++){

            max = Math.max(candies[i],max);
            
        } 

        // System.out.println(max);

        for(int i = 0 ; i < n ; i++){
            if(candies[i] + extraCandies >= max){
                // arr[i] = true ;
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }


        // for(int i = 0 ; i < n ; i++){

            
            
        // }
        
        System.out.println(arr);

    }
}
