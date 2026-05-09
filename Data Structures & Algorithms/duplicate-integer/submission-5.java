class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();

        for (int num : nums) {
            boolean isPresent = uniqueNums.add(num);
            if (!isPresent) {
                return true;
            }
        }
        return false;
    }
}