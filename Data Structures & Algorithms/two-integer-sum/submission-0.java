class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueIndexMap = new HashMap<>();
       for( int i = 0; i < nums.length; i++){
           int currentValue = nums[i];
           int diff = target - currentValue;
           if(valueIndexMap.get(diff) != null){
               return new int[] { valueIndexMap.get(diff),i};
           }
           else{
               valueIndexMap.put(currentValue, i);
           }
       }
       return new int[]{};
   }
}
