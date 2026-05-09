class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        for(int item: nums){
            if(!uniqueSet.add(item)){
                return true;
            }else{
                uniqueSet.add(item);
            }
        }
        return false;
    }
}