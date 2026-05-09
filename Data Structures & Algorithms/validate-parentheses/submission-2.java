class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Deque<String> stack = new ArrayDeque<>();
        while(i<s.length()){
            String ch = s.substring(i,i+1);
            if("{".equals(ch) || "[".equals(ch) ||  "(".equals(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                String lastEl = stack.pop();
                if(("}".equals(ch) && !"{".equals(lastEl)) ||
                        ("]".equals(ch) && !"[".equals(lastEl)) ||
                        (")".equals(ch) && !"(".equals(lastEl))){
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
}
