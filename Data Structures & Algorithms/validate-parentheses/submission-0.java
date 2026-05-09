class Solution {
     public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                characterStack.push(ch);
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                }
                char peekedElement = characterStack.peek();
                if ((peekedElement == '{' && ch == '}') ||
                        (peekedElement == '(' && ch == ')') ||
                        (peekedElement == '[' && ch == ']')) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }
        }

        return characterStack.isEmpty();
    }
}
