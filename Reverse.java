public class Reverse{
    public static void main(String[] args) {
        int arra[] = {1,2,3};

                
        int start = 0 ;
        int stop = arra.length ; 

        for(int i = start ; i < stop - start / 2 ; i++){
            int temp = arra[i];

            arra[i] = arra[arra.length - 1 - i];

            arra[arra.length - 1 - i] = temp ;

        }

        for(int j = 0 ; j < arra.length ; j++){
            System.err.print(arra[j]);
        }
    }
}









// int start = 0 ;
// int stop = arra.length ; 

// while(start < stop){
    
//     int temp = arra[start];
//     arra[start] = arra[stop];
//     arra[stop] = temp ; 
//     start++;
//     stop-- ;
// }