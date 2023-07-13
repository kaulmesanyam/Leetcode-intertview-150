import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap();
        boolean flag = true;
        for(int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
          if(map.containsKey(c)) {
              map.put(c, map.get(c) + 1);
          } else {
              map.put(c, 1);
          }
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if(!map.containsKey(c) || map.get(c) == 0 ) {
                flag = false;
                break;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        return flag;
    }
}
