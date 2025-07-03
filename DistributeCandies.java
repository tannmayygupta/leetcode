import java.util.Arrays;
import java.util.Scanner;

public class DistributeCandies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] candyType = {1,1,2,2,3,3};

        System.out.println(distributeCandies(candyType));
        
    }
    // 575. Distribute Candies
    public static int distributeCandies(int[] candyType) {

        Arrays.sort(candyType);

        int type = 1 ;

        for(int i = 1 ; i < candyType.length ; i++ ){
            if(candyType[i] != candyType[i-1]){
                type++;
            }
        }

        int eat = candyType.length / 2 ;

        if(eat >= type){
            return type;
        }
        else{
            return eat ;
        }
        
    }
}
