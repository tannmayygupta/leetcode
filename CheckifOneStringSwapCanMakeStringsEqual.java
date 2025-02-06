public class CheckifOneStringSwapCanMakeStringsEqual {
    int count = 0 ;
        int first = -1 ;
        int second = -1 ;
        for(int i = 0 ; i < s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
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
