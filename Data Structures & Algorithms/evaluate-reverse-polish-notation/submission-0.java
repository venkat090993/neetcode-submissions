class Solution {   
     Stack<Integer> stack = new Stack<>();

    public int evalRPN(String[] tokens) {
      
        for ( String token : tokens){
            if(token .equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                Integer value1 = stack.pop();
                Integer value2 = stack.pop();
                Integer answer = switch (token) {
                    case "+" -> value2 + value1;
                    case "-" -> value2 - value1;
                    case "*" -> value2 * value1;
                    case "/" -> value2 / value1;
                    default -> throw new ArithmeticException("invalid operator");
                };
                stack.push(answer);
            }else{
                Integer val = Integer.parseInt(token);
                stack.push(val);
            }
        }

        return stack.pop();  
    }
}
