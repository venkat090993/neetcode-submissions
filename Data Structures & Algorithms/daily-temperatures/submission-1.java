class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> monotonicStack = new ArrayDeque<>();
        for(int i=0; i<temperatures.length; i++){
            while(!monotonicStack.isEmpty() && temperatures[i] > temperatures[monotonicStack.peek()]){
                Integer idx = monotonicStack.pop();
                int dayDiff = i - idx;
                result[idx] = dayDiff;
            }   
            monotonicStack.push(i);
        }
        return result;
    }
}
