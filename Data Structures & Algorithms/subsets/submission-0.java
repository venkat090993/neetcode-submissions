class Solution {
    private void backtrack(int[] nums, int current_position, List<Integer> current_path, List<List<Integer>> result){
        // the maximum size of any array can be only the size of the nums itself
        // With this assumption, we are setting the base condition
        if(current_position == nums.length){
            result.add(new ArrayList<>(current_path));
            return;
        }

        current_path.add(nums[current_position]);
        backtrack(nums, current_position + 1, current_path, result);
        current_path.removeLast();
        backtrack(nums, current_position + 1, current_path, result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
}
