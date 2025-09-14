public class EarliestTimetoFinishOneTask {
    public static void main(String[] args) {
        
        int[][] tasks = {{1,6},{2,3}};

        System.out.println(earliestTime(tasks));   
    }
    public static int earliestTime(int[][] tasks) {

        int mintime = tasks[0][0] + tasks[0][1] ;

        for(int i = 1 ; i < tasks.length ; i++){
            int s1 = tasks[i][0];
            int t1 = tasks[i][1];

            int timereq = s1 + t1 ;

            if(timereq < mintime){
                mintime = timereq ;
            }
        }

        return mintime ; 
    }
}
