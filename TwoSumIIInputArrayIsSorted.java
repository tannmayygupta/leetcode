import java.util.Scanner;

public class TwoSumIIInputArrayIsSorted {
    
    public static int[] twoSum(int[] numbers, int target) {
        int end = numbers.length - 1;
        int start = 0 ;

        while(start < end){
            int res = numbers[end] + numbers[start] ;

            if(res == target){
                return new int[] {start + 1, end + 1};
            }

            
            if(numbers[start] + numbers[end] > target){
                end = end - 1 ;
            }
            else{
                start = start + 1 ;
            }

        }

        return new int[] {0,0};
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {2,7,11,15};

        int target = 9;

        int[] m = twoSum(numbers, target);

        for(int i = 0 ; i < m.length ; i++){
            System.out.println(m[i]);
        }
        
    }
}
