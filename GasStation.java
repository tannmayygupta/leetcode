public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {1,2,3,4,5};

        System.out.println(canCompleteCircuit(gas, cost));
        
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0 ;
        int gasleft = 0 ;
        int ans = 0 ;
        for(int i = 0 ; i < gas.length ; i++){
            total += gas[i] - cost[i];
            gasleft += gas[i] - cost[i];
            if(gasleft < 0){
                gasleft = 0 ;
                ans = i +1  ; // from here we can get the cycle 
            }
        }

        if(total >= 0){ // the toal is sumofgas -  (sum of cost ) 
                        // means gas of 100 and cost off 1000 for trip is 
                        // possible but not gas of 1000 and cost 100 is not
            return ans ;
        }

        return -1 ;
    }
}
