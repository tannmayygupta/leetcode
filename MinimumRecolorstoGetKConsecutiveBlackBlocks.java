import java.util.Scanner;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String that contain on 'W' and 'B' only: ");

        String s = sc.nextLine();

        int k = sc.nextInt();

        int m = minimumRecolors(s, k);
        
        System.out.println(m);
    }
    public static int minimumRecolors(String blocks, int k) {
        int minm = Integer.MAX_VALUE;
        int count = 0 ;

        if(k > blocks.length()){
            return -1 ;
        }

        for(int i = 0 ; i <= blocks.length() - k ; i++){
            count = 0 ;
            for(int j = i ; j < i + k ; j++){
                if(blocks.charAt(j) != 'B'){
                    count++;
                }         
            }
            minm = Math.min(minm,count);
        }
        return minm ;
    }
}
