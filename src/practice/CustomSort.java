package practice;

import java.util.*;

public class CustomSort {

    public static void main(String[] args) {

        String str = "avadakadavra"; // a=6, v=2, d=2, k=1, r=1

        char[] arr = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch: arr) map.put(ch, map.getOrDefault(ch, 0) + 1);

        int maxFreq = Collections.max(map.values());
        List<List<Character>> list = new ArrayList<>();
        for(int i = 0; i < maxFreq; i++)
            list.add(new ArrayList<>());

        for(char ch: map.keySet())
        {
            int freq = map.get(ch);
            list.get(freq-1).add(ch);
        }
        StringBuilder sb = new StringBuilder();

        for(int i = maxFreq-1; i >= 0; i--)
        {
            List<Character> ch = list.get(i);
            for(int j = 0; j < ch.size(); j++)
            {
                int n = map.get(ch.get(j));
                while( n-- > 0 )
                    sb.append(ch.get(j));
            }
        }
        System.out.println(sb.toString());
    }
}
