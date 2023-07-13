public class FindIndexOfFirstOccuranceInAString {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
            String subStr = haystack.substring(i, i + needle.length());
            if(needle.equals(subStr)) {
                return i;
            }
        }

        return -1;
    }
}
