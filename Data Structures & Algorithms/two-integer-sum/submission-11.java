class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force: Two loops, i != j and num[i] + nums[j] = T -> return indexes

        // I want to solve O(n) -> as O(n2) is not ideal

        // I hash all the items with it's index
        // I iterate from 1 -> n, see if already a compliment number exist
        // if yes, I return

        HashMap<Integer, Integer> valueIdxHash = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int compliment = target - nums[i];
            Integer idxOfCompliment = valueIdxHash.get(compliment);
            if(idxOfCompliment != null){
                return new int[]{idxOfCompliment, i};
            }
            valueIdxHash.put(nums[i], i);
        }

        return new int[]{-1, -1};
        
    }
}
