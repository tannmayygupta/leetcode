import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();

        System.out.println(numWaterBottles(numBottles, numExchange));
        
    }

    public static int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles ;

        while(numBottles >= numExchange){
            ans += numBottles / numExchange ;
            numBottles = ( numBottles / numExchange ) + (numBottles % numExchange);
        }
        
        return ans ;
    }

}
