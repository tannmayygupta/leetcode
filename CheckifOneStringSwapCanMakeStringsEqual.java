public class CheckifOneStringSwapCanMakeStringsEqual {

    public static void main(String[] args) {

        String s1 = "leetcode";

        String s2 = "leetcode";

        
        int count = 0 ;
        
        int first = -1 ;
        
        int second = -1 ;
        
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);

            if(ch != s2.charAt(i)){
                count++ ;

                if(first == -1){
                    first = i ;
                }
                else{
                    second = i ;
                    // break ;
                }
            }
        }


    }

        // if(count > 2){
        //     return false ;
        // }
        // if(count == 0){
        //     return true ;
        // }
        // if(count == 2 && (s1.charAt(first) == s2.charAt(second)) && (s1.charAt(second) == s2.charAt(first))){
        //     return true ;
        // }
        // else{
        //     return false ;
        // }

        
        // if(s1.length() == 2){
        //     if(count > s1.length() / 2){
        //         return true ;
        //     }
        //     else{
        //         return false ;
        //     }
        // }
        // if(count >= s1.length() / 2 ){
        //     return true ;
        // }
        // else{
        //     return false ;
        // }
}
