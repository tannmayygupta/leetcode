public class ReportSpamMessage {
    public static void main(String[] args) {

        String[] mess = {"hello","world","leetcode"};

        String[] bannedWord = {"world","hello"};

        boolean x = reportSpam(mess,bannedWord);

        System.out.println(x);
        
    }
    public static boolean reportSpam(String[] message, String[] bannedWords) {
        int count = 0;
        
        for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < bannedWords.length; j++) {
                if (message[i].equals(bannedWords[j])) {
                    count++;
                    break;
                }
            }
            if (count >= 2) {
                return true;
            }
        }

        return false;
   }

}



