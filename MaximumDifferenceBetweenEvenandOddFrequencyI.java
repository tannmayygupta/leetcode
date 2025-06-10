import java.util.Scanner;

public class MaximumDifferenceBetweenEvenandOddFrequencyI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(s);
    }

    public static int maxDifference(String s) {
        
        int maxODD = Integer.MIN_VALUE ;

        int minEVEN = Integer.MAX_VALUE ;

        int arr[] = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            int m = c - 'a' ;

            arr[m]++;
        }

        for(int j = 0 ; j < arr.length ;j++){
            if(arr[j] % 2 == 1){
                maxODD = Math.max(maxODD,arr[j]);
            }
            else if( arr[j] % 2 == 0 && arr[j] != 0){
                minEVEN = Math.min(minEVEN , arr[j]); 
            }
        }

        return maxODD - minEVEN ;
    }
}
