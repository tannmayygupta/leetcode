import java.util.Arrays;

public class BinarySearchRowiseColumnwiseSortedArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {18,24,36,44},
            {28,29,37,49},
            {33,34,39,50}
        };

        int target = 39 ;

        System.out.println(Arrays.toString(RowiseANDColumnwiseSorted(arr, target)));
        
    }
    public static int[] RowiseANDColumnwiseSorted(int[][] arr, int target){

        int row = 0 ;
        int col = arr.length - 1 ;

        while(row < arr.length && col >= 0){
            if(target == arr[row][col]){
                return new int[] {row , col};
            }

            if(target > arr[row][col]){
                row = row + 1; 
            }
            else{
                col = col - 1;
            }
        }
        
        return new int[] {-1,-1};
    }
}
