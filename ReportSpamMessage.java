import java.util.HashSet;

public class ReportSpamMessage {
    public static void main(String[] args) {

        String[] mess = {"hello","world","leetcode"};

        String[] bannedWord = {"world","hello"};

        boolean x = reportSpam(mess,bannedWord);

        System.out.println(x);
        
    }
    public static boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>(bannedWords.length + bannedWords.length / 3 + 1);
        int count = 0;
        boolean isSpam = false;

        for (String words : bannedWords) {
            set.add(words);
        }
        for (int i = 0; i < message.length; i++) {
            if (set.contains(message[i])) {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }

}



