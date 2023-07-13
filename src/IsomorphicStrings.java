import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        return check(s, t) && check(t, s);
    }

    private boolean check(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        boolean flag = true;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char currCharFromS = s.charAt(i);
            char currCharFromT =  t.charAt(i);

            if(map.containsKey(currCharFromS)) {
                if(currCharFromT != map.get(currCharFromS)) {
                    flag = false;
                    break;
                }
            } else {
                map.put(currCharFromS, currCharFromT);
            }
        }

        return flag;
    }
}
