public class FindMaximumNumberofStringPairs {
    public static void main(String[] args) {

        String[] words = {"cd","ac","dc","ca","zz"};

        System.out.println(maximumNumberOfStringPairs(words));
        
    }
    public static int maximumNumberOfStringPairs(String[] words) {

        int pairs = 0 ; 

        for(int i = 0 ; i < words.length - 1 ; i++){
            for(int j = i+1 ; j < words.length ; j++){
                String s = words[i];
                String s1 = words[j];

                if(s.charAt(0) == s1.charAt(1) && s.charAt(1) == s1.charAt(0)){
                    pairs++;
                }

            }   

        }
        
        return pairs ;
    }
}
