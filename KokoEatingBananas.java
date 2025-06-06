import java.util.Arrays;
public class KokoEatingBananas {

    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000 ;

        System.out.println(minEatingSpeed(piles, h));

    }
        public static int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);

        int end = piles[piles.length - 1];

        int start = 1 ;

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(totalhour(piles,mid,h) <= h){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start ;
    }

    public static int totalhour(int[] piles, int k , int h){
        int totalhours = 0 ;

        for(int i = 0 ; i < piles.length ; i++){
            
            int a = piles[i];
            double b = k ;
            int x = (int) Math.ceil( (double) a / b);
            totalhours += x ;
        }

        return totalhours ;
    }

}
