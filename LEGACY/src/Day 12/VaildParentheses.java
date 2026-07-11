import java.util.Stack;

public class VaildParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no corresponding open bracket
                }

                char openBracket = stack.pop();

                if ((c == ')' && openBracket != '(') ||
                        (c == '}' && openBracket != '{') ||
                        (c == ']' && openBracket != '[')) {
                    return false; // Mismatched open and close brackets
                }
            }
        }

        return stack.isEmpty(); // Check if there are any remaining open brackets
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValid("()")); // Output: true
        System.out.println(isValid("()[]{}")); // Output: true
        System.out.println(isValid("(]")); // Output: false
    }
}
