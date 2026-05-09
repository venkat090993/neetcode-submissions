class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complimentMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            complimentMap.put(nums[i], i);
        }


        for(int j=0; j<nums.length; j++){
            int searchElement = target - nums[j];
            Integer complementNumberIdx = complimentMap.get(searchElement);
            if(complementNumberIdx != null && complementNumberIdx != j){
                return complementNumberIdx < j ? new int[]{complementNumberIdx, j}: new int[]{j, complementNumberIdx};
            }
        }

        return new int[]{};
        
    }
}
