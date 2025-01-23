public class Stock {
    public static void main(String[] args) {
        int index = 0  ;
        int prices[] = {7,1,5,3,6,4};
        int n = prices.length ;
        int min = Integer.MAX_VALUE ;
        int sub = 0 ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i++){
            min = Math.min(prices[i],min);
        }
        for(int j = 0 ; j < n ; j++){
            if(prices[j] == min){
                index = j ;
                break;
            }
        }
        System.out.println(index);
        if(index == (n - 1)){
            // return 0 ; // stocks can't be buy after and sell before 
        }
        else{
            for(int k = index ; k < n - 1  ; k++ ){
                sub = 0 ;
                sub = prices[k + 1] - prices[index];
                max = Math.max(sub,max);
                System.out.println(sub);
            }
        }
    //     return max ; 
    }
}
