package HashMap;

import java.util.HashMap;

public class HashMapQues {
    public static void main(String[] args) {
        String str = "abcaabcccdeacaaaaaaaaaaaaaaaaaaaaaaa";

        System.out.println(maxFreqChar(str));

    }

    private static char maxFreqChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                count = map.get(str.charAt(i));
                count+=1;
                map.put(str.charAt(i), count);
            } else {
                count = 0;
                map.put(str.charAt(i), ++count);
            }
        }

        int val = 0;
        char maxFreq = ' ';
        for (char ch : map.keySet()) {
            int max = map.get(ch);
            if(max  >  val) {
                maxFreq = ch;
                val = max;
            }
        }

        return maxFreq;
    }
}
