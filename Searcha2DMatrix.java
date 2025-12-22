import java.util.Scanner;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {  {1 ,2 ,3 ,4 ,5 },
                            {6 ,7 ,8 ,9 ,10},
                            {11,12,13,14,15},    
                            {16,17,18,19,20},    
                            {21,22,23,24,25}  
                        };

        System.out.println(bs2d(matrix,15));
    }

    public static boolean bs2d(int[][] matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length ;

        int st = 0 ;
        int end = row * col - 1 ;

        while (st <= end) {
            int mid = st +  (end - st)/ 2 ;


            int val = matrix[mid / col][mid % col];

            if(val == target){
                return true ;
            }

            if(val > target){
                end = mid - 1 ;
            }
            else{
                st = end + 1 ;
            }
        }
        return false ;
    }

}
