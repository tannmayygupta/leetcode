public class ValidWord {
    public static void main(String[] args) {

        String word = "a3$e";

        System.out.println(isValid(word));
        
    }
    public static boolean isValid(String word) {

        int vowel = 0 ; 

        int digit = 0 ;

        int consonant = 0 ;

        if(word.length() < 3){
            return false ;
        }

        for(int i = 0 ; i < word.length() ; i++){

            // char ch = word.charAt(i).toLowerCase();

            char ch = Character.toLowerCase(word.charAt(i));

            if(isvowel(ch)){
                vowel++;
            }
            else if(ch >= '0' && ch <= '9' ){
                digit++;
            }
            else{
                consonant++;            
            }
        }

        if(vowel >= 1 && consonant >= 1  && digit >= 1){
            return true ;
        }

        return false ;
    }

    static boolean isvowel(char ch){
        return ch == 'a' || ch == 'u' || ch == 'o' || ch == 'i' ||  ch == 'e' ;
    }

}
