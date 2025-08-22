public class FindtheMinimumAreatoCoverAllOnesI {
    public static void main(String[] args) {
        // 3195. Find the Minimum Area to Cover All Ones I
        // https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/description/?envType=daily-question&envId=2025-08-22
        int[][] grid = {{0},{1}};

        System.out.println(minimumArea(grid));
        
    }

    static int minimumArea(int[][] grid) {

        int mini = grid.length;
        int minj = grid[0].length ;
        int maxi = -1 ;
        int maxj = -1 ; 

        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    mini = Math.min(mini,i);
                    minj = Math.min(minj,j);
                    maxi = Math.max(maxi,i);
                    maxj = Math.max(maxj,j);
                }
            }
        }
        
        int area = (maxi - mini + 1) * (maxj - minj + 1) ;

        return area ;
    }
}
