class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            numIndexMap.put(nums[i],i);
        }

        for(int j = 0; j< nums.length; j++){
          int complementNumber = target - nums[j];
            if(numIndexMap.get(complementNumber) != null && numIndexMap.get(complementNumber) != j){
                return new int[]{j, numIndexMap.get(complementNumber)};
            }
        }

        return new int[] {};
    }
}
