class Solution {
    map={}

    findMax(n,nums){
        if(this.map[n] !== undefined){
            return this.map[n];
        }
        if(n < 0) return 0;
        if(n == 0) return nums[0];
        if(n == 1) return Math.max(nums[0],nums[1]);
        const max =  Math.max(nums[n]+this.findMax(n-2, nums), this.findMax(n-1, nums));
        this.map[n] = max;
        return max;
    }
    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        const n = nums.length - 1;
        return this.findMax(n, nums);

    }
}
