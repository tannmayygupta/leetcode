public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {

        String s = "weallloveyou";

        int k = 7 ;

        System.out.println(maxVowels(s, k));
        
    }

    public static int maxVowels(String s, int k) {

        int sammam = 0 ;

        for(int i = 0 ; i < s.length() - k ; i++){
            String s1 = s.substring(i,i+k);
            sammam = Math.max(sammam , tancou(s1));
        }

        return sammam;
        
    }
    public static int tancou(String s1){
        int tanmay = 0 ;

        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                tanmay++;
            }
        }

        return tanmay ;
    }

    // public static int countvowel(String s1){

    //     int mam = 0 ;

    //     for(int i = 0 ; i < s1.length() ; i++){

    //         char ch = s.charAt(i);

    //         if()

    //     }

    //     return mam ;
    // }
}
