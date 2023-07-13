import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0;i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                boolean samePar = check(stack, s.charAt(i));
                if(samePar) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        if(stack.isEmpty()) return true;
        return false;
    }

    private boolean check(Stack<Character> stack, char charAt) {
        char c = stack.peek();
        if( charAt == ')' && c == '(' ) return true;
        if( charAt == ']' && c == '[' ) return true;
        if( charAt == '}' && c == '{' ) return true;

        return false;
    }
}
