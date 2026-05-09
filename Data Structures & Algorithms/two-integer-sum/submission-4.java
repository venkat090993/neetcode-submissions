class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }



      for(int j=0; j<nums.length; j++){
            int valueToFind = target - nums[j];
            if(map.get(valueToFind) != null && map.get(valueToFind)!= j){
                int valueInMap = map.get(valueToFind);
                int[] resultArray = valueInMap > j ? new int[]{j,valueInMap} : new int[]{valueInMap, j};
                return resultArray;
            }
        }
        
        return new int[2];

    }
}
