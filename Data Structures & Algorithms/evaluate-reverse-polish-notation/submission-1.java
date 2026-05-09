class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(String token : tokens){
            if("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)){
                Integer temp = 0;
                Integer el1 = stack.pop();
                Integer el2 = stack.pop();
                Integer result = Integer.MIN_VALUE;
                if("+".equals(token)) {
                    result = el1 + el2;
                }else if("-".equals(token)) {
                    result = el2 - el1;
                }else if("*".equals(token)) {
                    result = el2 * el1;
                }else if("/".equals(token)) {
                    result = el2 / el1;
                }
                stack.push(result);
            }else{
                Integer intVal = Integer.parseInt(token);
                stack.push(intVal);
            }
        };
        return stack.pop();
        
    }
}
