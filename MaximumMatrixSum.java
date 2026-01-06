public class MaximumMatrixSum {
    public static void main(String[] args) {
        int[][] nums =  {{1,4},{-1,7}} ;
        System.out.println(maxMatrixSum(nums));
    }
    public static long maxMatrixSum(int[][] matrix) {
        int minvalue = Integer.MAX_VALUE ;
        int countNeg = 0 ;
        long sum = 0 ;

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                sum += Math.abs(matrix[i][j]);
                // we need the minimum elemnt in the matrix not only negatobe mini elemen
                minvalue = Math.min(minvalue,Math.abs(matrix[i][j]));
        
                if(matrix[i][j] < 0){
                    // minvalue = Math.min(minvalue,Math.abs(matrix[i][j]));
                    countNeg++;
                }

            }
        }

        if(countNeg % 2 != 0){
            return sum - 2 * minvalue ; // why 2 into minvalue
                                        // because one time we add it in total sum in
                                        // iteration
                                        // ont time we have to substract it 
                                        // one time when we will take sum of matrix when there is only one negative elemnt so we need to add that one lefft negative eleent in the sum 
        }

        return sum ;
    }
}
