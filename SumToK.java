public class SumToK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        int n =  arr.length;
        int k = 15 ;

        for(int st = 0 ; st < n ; st++){
            int sum = 0 ;
            for(int end = st ; end < n ; end++){
                    sum += arr[end] ;
            }
        }

    }
}
