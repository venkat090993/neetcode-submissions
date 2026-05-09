class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // without sorted array, I cannot say when to move pointers
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length - 2){
            if(i > 0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }
            int l = i+1, r = nums.length - 1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    result.add(List.of(nums[i],nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }
                } else if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
            i++;
        };
        return result;
    }
}
