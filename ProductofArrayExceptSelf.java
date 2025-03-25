public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = productExceptSelf(nums);

        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        if(n == 1){
            return new int[] {nums[0]} ;
        }

        int[] res = new int[n];

        int left = -1;
        int right = -1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left = -1;
                right = i + 1;
                res[i] = product(left, right, nums);
            } else if (i == nums.length - 1) {
                left = nums.length - 2 ;
                right = -1;
                res[i] = product(left, right, nums);
            } else {
                left = i - 1;
                right = i + 1;
                res[i] = product(left, right, nums);
            }
        }
        return res;
    }

    public static int product(int left, int right, int[] nums) {
        int product = 1;
        if (left != -1) {
            while (left >= 0) {
                product *= nums[left];
                left--;
            }
        }
        if (right != -1) {
            while (right < nums.length) {
                product *= nums[right];
                right++;
            }
        }
        return product;
    }
}