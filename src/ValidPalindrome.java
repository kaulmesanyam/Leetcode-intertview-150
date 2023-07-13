import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        s = convertToString(s);

        int i = 0, j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private String convertToString(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {


            int asciVal = (int) s.charAt(i);
            if((asciVal >= 48 && asciVal <= 57) || (asciVal >= 65 && asciVal <= 90) || (asciVal >= 97 && asciVal <= 122 )) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().toLowerCase();
    }
}
