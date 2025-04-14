public class CountGoodTriplets {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,2,5,8};

        int a = 1 ;
        int b = 5 ;
        int c = 2 ;
        int x = countGoodTriplets(arr, a, b, c);

        System.out.println(x);
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
    
            int count = 0 ;
    
            for(int i = 0 ; i < arr.length - 2 ; i++){
                for(int j = i + 1 ; j < arr.length - 1 ; j++){
                    for(int k = j + 1 ; k < arr.length ; k++){
                        if((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)  ){
                            count++;
                        }
                    }
                }
            }
    
            return count ;
            
    }
}
