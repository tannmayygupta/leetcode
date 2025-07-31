import java.util.HashMap;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};

        String[] words2 = {"amazing","leetcode","is"};

        System.out.println(countWords(words1, words2));
        
    }
    public static int countWords(String[] words1, String[] words2) {
        HashMap<String , Integer> map1 = new HashMap<>();
        HashMap<String , Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < words1.length ; i++){
            map1.put(words1[i],map1.getOrDefault(words1[i],0)+1);
        }

        for(int i = 0 ; i < words2.length ; i++){
            map2.put(words2[i],map2.getOrDefault(words2[i],0)+1);
        }

        int cou = 0 ;

        // for(int i = 0 ; i < words1.length ; i++){
        //     if(map1.get(words1[i]) == 1 && map2.getOrDefault(words2[i],0) == 1){
        //         cou++;
        //     }
        // }

        for(String word : map1.keySet()){
            if(map1.get(word) == 1 && map2.getOrDefault(word,0)==1){
                cou++;
            }
        }

        return cou ;
    }
}
