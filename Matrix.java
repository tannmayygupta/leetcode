import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        char[][] diffmat = new char[n][n];

        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i++ ){
            if(i == 0 || i == n - 1){
                continue ;
            }
            for(int j = 0 ; j < n ; j++){
                if(j == 0 || j == n - 1){
                    continue ;
                }
                if(mat[i][j] > mat[i][j+1] && mat[i][j] > mat[i][j-1]){
                    diffmat[i][j] = 'X';
                }
            }
        }

        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                if(diffmat[i][j] == 'X'){
                    System.out.print(diffmat[i][j]);
                }else{
                    System.out.print(mat[i][j]);
                }
            }
            System.out.println();
        }
        
    }
}
