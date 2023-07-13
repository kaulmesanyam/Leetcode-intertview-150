public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while(i >= 0) {
            if(s.charAt(i) == ' ') {
                i--;
            } else {
                break;
            }
        }

        if(i >= 0) {
            int count = 0;
            while( (i >= 0) && (s.charAt(i) != ' ') ) {
                count++;
                i--;
            }
            length = count;
        }
        return length;
    }
}
