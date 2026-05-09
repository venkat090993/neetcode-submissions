class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] exclusivePrefixArr = new int[nums.length];
        exclusivePrefixArr[0] = 1;
        for(int i = 1; i<nums.length; i++){
            exclusivePrefixArr[i] = exclusivePrefixArr[i-1] * nums[i-1];
        }

        int runningProduct = 1;
        for(int i = nums.length - 1; i>=0; i--){
            exclusivePrefixArr[i] = exclusivePrefixArr[i] * runningProduct;
            runningProduct *= nums[i];
        }

        return exclusivePrefixArr;
    }
}  
