import java.util.Arrays;
import java.util.Scanner;

public class AppleRedistributionintoBoxes {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] apple = {1,3,2};
        int[] capacity = {4,3,1,5,2};

        System.out.println(minimumBoxes(apple , capacity));
    }
    public static int minimumBoxes(int[] apple, int[] capacity) {

        int sum = 0 ;
        for(int i = 0 ;i < apple.length ; i++){
            sum+= apple[i];
        }
        Arrays.sort(capacity);
        int box  = 0 ;
        int ans = 0 ;
        for(int i = capacity.length - 1 ; i >= 0 ; i--){
            box += capacity[i];
            ans++;
            if(box >= sum){
                break ;
            }
        }
        return ans ;
    }
}
