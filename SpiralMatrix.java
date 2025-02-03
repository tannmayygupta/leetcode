import  java.util.* ;

public class SpiralMatrix {
    public static void main(String[] args) {
        List<Integer> spiral = new ArrayList<Integer>();
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] arr = {{1,2},{3,4}};
        int m = arr.length ; // row // 1
        int n = arr[0].length ; // colo // 1

        int i = 0 ; 
        int j = 0 ;

        while(j < n){
            spiral.add(arr[i][j]);
            j++;
        }

        j = j - 1 ;


        while(i < m - 1 ){
            i++;
            spiral.add(arr[i][j]);
        }


        // System.out.println(i); // i == 2

        // System.out.println(j-1);

        while(j - 1 >= 0 ){
            j--;
            spiral.add(arr[i][j]);
        }

        // System.out.println(j); // 0

        i = i - 1 ;

        // System.out.println(i);
        
        while(j < n - 1){
            spiral.add(arr[i][j]);
            j++;
        }

        System.out.println(spiral);
    }
}
