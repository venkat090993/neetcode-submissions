class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    missingNumber(nums) {
        let result = 0;
        for(let i = 0; i<=nums.length; i++){
            result ^= i;
        }

        for(let i = 0; i<nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
}
