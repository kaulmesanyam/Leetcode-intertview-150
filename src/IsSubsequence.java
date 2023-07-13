public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty() || s.length() == 0) {
            return true;
        }
        boolean flag = false;

        int i = 0;

        for(int j = 0; j < t.length(); j++) {
            if( (s.charAt(i) == t.charAt(j)) ) {
                i++;
            }
            if(i == s.length()) {
                flag = true;
                break;
            }
        }


        return flag;
    }
}
