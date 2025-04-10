public class MinimumCosttoReachEveryPosition {
    public static void main(String[] args) {
        int[] cost = {5,3,3,1,4,2};
        int[] a = minCosts(cost);
        
    }
    public static int[] minCosts(int[] cost) {
    
            int[] arr = new int[cost.length];
    
            int min = cost[0] ;
    
            for(int i = 0 ; i < cost.length ;i++){
    
                if(cost[i] < min){
                    min = cost[i];
                }
                arr[i] = min ;
            }
    
            return arr ;
            
    }
}
