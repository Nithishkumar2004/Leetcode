class Solution {
    public boolean isValid(String s) {
        // Using expression validation method
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            
            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char top;
            switch (x) {
                case ')':
                    top = stack.pop();
                    if (top != '(') {
                        return false;
                    }
                    break;

                case ']':
                    top = stack.pop();
                    if (top != '[') {
                        return false;
                    }
                    break;

                case '}':
                    top = stack.pop();
                    if (top != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
