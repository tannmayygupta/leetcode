import java.util.*;

public class IsomorphicStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String t = sc.nextLine();

        System.out.println(isIsomorphic(s, t));
        
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> ans = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(!ans.containsKey(s.charAt(i))){
                if(ans.containsValue(t.charAt(i))){
                    return false ;
                }
                ans.put(s.charAt(i) , t.charAt(i));
            }
            
            else if(ans.containsKey(s.charAt(i)) && ans.get(s.charAt(i)) != t.charAt(i) ){
                return false;
            }
        }
        return true ;
    }
}