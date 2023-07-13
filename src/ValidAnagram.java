import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(str1.length != str2.length ) {
            return false;
        }

        for(int i = 0 ; i < str1.length; i++) {
            if(str1[i] != str2[i]) return false;
        }

        return true;
    }
}
