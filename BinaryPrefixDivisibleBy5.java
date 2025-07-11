import java.util.ArrayList;
import java.util.List;
// 1018. Binary Prefix Divisible By 5

// https://leetcode.com/problems/binary-prefix-divisible-by-5/description/

public class BinaryPrefixDivisibleBy5 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1,0,1,0,1};

        System.out.println(prefixesDivBy5(nums));

    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> ans = new ArrayList<>();

        int curr = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            curr = (curr * 2 + nums[i]) % 5 ;
            ans.add(curr == 0);
        }

        return ans ;
    }
}
