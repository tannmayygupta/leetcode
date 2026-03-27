import java.util.Arrays;



// 2946. Matrix Similarity After Cyclic Shifts
// https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/
// https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/solutions/
public class MatrixSimilarityAfterCyclicShifts {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int k = 2 ;
        System.out.println(areSimilar(mat,k));
    }
    public static boolean areSimilar(int[][] mat, int k) {
        String inital = Arrays.deepToString(mat);

        k = k % mat[0].length ;

        for(int i = 0 ; i < mat.length ; i++){
            if(i % 2 == 0){
                // left rotate
                int[] arr = new int[mat[0].length];
                int m = 0 ;

                for(int p = k ; p < arr.length ; p++){
                    arr[m] = mat[i][p];
                    m++;
                }

                for(int p = 0 ; p < k ; p++){
                    arr[m] = mat[i][p];
                    m++;
                }

                // put back in array 
                mat[i] = arr ;
                // for(int p = 0 ; p < arr.length ; p++){
                //     mat[i][p] = arr[p];
                // }
            }else{
                // right rotate we follow 3 step easy to remember

                int[] arr = mat[i] ;
                
                // reverse complete array ;
                int f = 0 ;
                int l = arr.length - 1 ;
                while(f < l){
                    int temp = arr[f];
                    arr[f] = arr[l];
                    arr[l] = temp ;
                    f++;
                    l--;
                }
                
                // reverse first k array ;
                f = 0 ;
                l = k - 1 ;
                while(f < l){
                    int temp = arr[f];
                    arr[f] = arr[l];
                    arr[l] = temp ;
                    f++;
                    l--;
                }

                // reverse element after k to end array ;
                f = k ;
                l = mat[i].length - 1 ;
                while(f < l){
                    int temp = arr[f];
                    arr[f] = arr[l];
                    arr[l] = temp ;
                    f++;
                    l--;
                }
            }
        }

        String ans = Arrays.deepToString(mat);
        if(inital.equals(ans)){
            return true ;
        }

        return false ;
    }
}
