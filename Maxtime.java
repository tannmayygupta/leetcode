public class Maxtime {
    public static void main(String[] args) {
        int eventTime = 10 ,  k = 1 ;
        int[] startTime = {0,2,9}; 
        int[] endTime = {1,4,10};
        int n = startTime.length ;
        int sub = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            sub = 0 ;
            sub =  endTime[i] - startTime[i] ;
            eventTime = eventTime - sub ;
        }
        
        // System.out.println(eventTime);

        // if(eventTime > 0 ){
        //     return eventTime ;
        // }
        // else{
        //     return 0 ;
        // }
    }
}
