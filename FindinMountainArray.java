public class FindinMountainArray{
    public static void main(String[] args) {
        
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0 ;
        int end = mountainArr.length() - 1 ;

        int peak = peakIndex(mountainArr, start , end);

        int found = orderAgnostic(mountainArr, target , 0 ,peak, true );
        if(found != -1){
            return found;
        }
        else{
            return orderAgnostic(mountainArr, target , peak + 1 , end , false );
        }
    }

    public static int orderAgnostic(MountainArray arr , int target , int start , int end , boolean isAsen){

        while(start <= end){
            int mid = start + (end - start)/ 2 ;

            if(arr.get(mid) == target){
                return mid ;
            }

            if(isAsen){
                if(target > arr.get(mid)){
                    start = mid + 1 ;
                }
                else{
                    end = mid - 1 ;
                }
            }
            else{
                if(target < arr.get(mid)){
                    start = mid + 1 ;
                }
                else{
                    end = mid - 1 ;
                }
            }
        }
        
        return -1;
    }

    public static int peakIndex(MountainArray mountainArr, int start , int end){

        while(start < end){
            int mid = start + (end - start)/ 2 ;

            int midval = mountainArr.get(mid);
            int midvalaage = mountainArr.get(mid+1);
            if( midval > midvalaage){
                // mean we are in decresing part of arr 
                // to get the peak or maximum value 
                end = mid ;
            }
            else{
                start = mid + 1 ;
            }
        }
        return start ;
    }
}