public class MaximumAreaofLongestDiagonalRectangle {
    // 3000. Maximum Area of Longest Diagonal Rectangle
    // https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/
    public static void main(String[] args) {
        int[][] dimensions = {{6,5},{8,6},{2,10},{8,1},{9,2},{3,5},{3,5}};

        int a = areaOfMaxDiagonal(dimensions);
        
        System.out.println(a);
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {

        double max = 0 ;
        int maxarea = 0 ;

        for(int i = 0 ; i < dimensions.length ; i++){

            double length1 =  (double) Math.sqrt( (double) (dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]) );

            if(length1 >= max){
                max = length1 ;

                int area = dimensions[i][0] * dimensions[i][1] ;

                if(maxarea <= area){
                    maxarea = area ;
                }

            }

            
        }
        
        return maxarea ; 
    }
}
