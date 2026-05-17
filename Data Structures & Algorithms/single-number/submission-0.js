class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    singleNumber(nums) {
        let result = nums[0];
        for(let i = 1; i<nums.length; i++){
            result = result ^ nums[i]
        }
        return result;
    }
}
