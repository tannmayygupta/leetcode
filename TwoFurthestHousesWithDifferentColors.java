import java.util.Scanner;

// https://leetcode.com/problems/two-furthest-houses-with-different-colors/description/


public class TwoFurthestHousesWithDifferentColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] colors = {1,1,1,6,1,1,1};

        System.out.println(maxDistance(colors));
    }
    public static int maxDistance(int[] colors) {

        int max = 0 ;
        
        for(int i = 0 ; i < colors.length ; i++){
            for(int j = i + 1 ; j < colors.length ; j++){
                if(colors[i] != colors[j]){
                    max = Math.max(max,Math.abs(i - j));
                }
            }
        }

        return max ;
        
    }
}
