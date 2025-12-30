package Strings.Easy;

public class RemoveOuterParanthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int opened = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (opened > 0) {
                    result.append(c);
                }
                opened++;
            } else {
                opened--;
                if (opened > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        s = removeOuterParentheses(s);
        System.out.println(s);
    }
}
