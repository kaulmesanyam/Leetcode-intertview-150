public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String str = strs[0];
        for(int i = 1; i < strs.length; i++) {
           sb = new StringBuilder();
           String curr = strs[i];
           int x = 0;
           while(x < str.length() && x < curr.length()) {

               if(str.charAt(x) == curr.charAt(x)) {
                   sb.append(str.charAt(x));
               } else {
                   break;
               }
               x++;
           }

           str = sb.toString();
       }

       return str;
    }
}
