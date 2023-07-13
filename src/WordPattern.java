import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");

        if(pattern.length() != str.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!str[i].equals(map.get(pattern.charAt(i)))) return false;
            } else {
                if(mapContainsVal(map, str[i])) return false;
                map.put(pattern.charAt(i), str[i]);
            }
        }
        return true;
    }

    private boolean mapContainsVal(HashMap<Character, String> map, String s) {
        for(String str: map.values()) {
            if(str.equals(s)) return true;
        }
        return false;
    }
}
