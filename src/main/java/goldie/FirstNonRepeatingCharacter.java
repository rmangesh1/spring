package goldie;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mrana on 21.02.2018.
 */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "GeeksforGeeks";

        Map<String, Integer> map = new LinkedHashMap<>();
        Character c = null;
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if(!map.containsKey(c.toString())) {
                map.put(c.toString(), 1);
            } else {
                map.put(c.toString(), map.get(c.toString())+1);
            }
        }
        System.out.println(map);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
