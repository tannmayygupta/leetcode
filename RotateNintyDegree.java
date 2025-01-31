public class RotateNintyDegree {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length ;
        int[][] trans = new int[n][n];
        // int[][] arr1 = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                trans[j][i] = arr[i][j];
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.println(trans[i][j]); // transpose
            }
        }

        System.out.println();

        int l = 0 ;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                    l = n - 1 - j ;
                    arr[i][j] = trans[i][l] ;
            }
            l = 0 ;
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.println(arr[i][j]); 
            }
        }
    }
}
