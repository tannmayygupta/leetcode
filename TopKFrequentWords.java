import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }

    class Pair {
        String s;
        int count;

        public Pair(String s, int count) {
            this.s = s;
            this.count = count;
        }
    }

    public static List<String> topKFrequent(String[] words, int k) {
        // PriorityQueue<Pair> heap = new PriorityQueue<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                int val = map.get(words[i]);
                map.put(words[i], val + 1);
            } else {
                map.put(words[i], 1);
            }
        }

        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> {
            if (b.count != a.count) {
                return b.count - a.count;
            }
            // return a.s - b.s ;
            return a.s.compareTo(b.s);
        });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s1 = entry.getKey();
            Integer fre = entry.getValue();
            heap.add(new Pair(s1, fre));
        }

        List<String> ans = new ArrayList<>();

        while (k > 0) {
            // k is in the range [1, The number of unique words[i]]
            // so no check for heap empty
            String ks = heap.poll().s;
            ans.add(ks);
            k--;
        }

        return ans;
    }
}
