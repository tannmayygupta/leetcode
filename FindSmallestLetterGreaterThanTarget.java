public class FindSmallestLetterGreaterThanTarget{
    public static void main(String[] args) {

        char arr[] = {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(arr, target));
        
    }
    public static char nextGreatestLetter(char[] arr , char target) {
        // ceil means that smallest number that greater or equal to the target

        // but here only greater element 

        int start = 0 ;
        int end = arr.length - 1 ;

        while(start <= end){
            int mid = start + (end - start)/ 2 ;

            if(target < arr[mid]){
                end = mid - 1 ;
            }
            else{
                start = mid + 1 ;
            }
        }
        
        // return arr[start % arr.length] ;

        if(start == arr.length){
            return arr[0];
        }

        return arr[start];
       
    }
}