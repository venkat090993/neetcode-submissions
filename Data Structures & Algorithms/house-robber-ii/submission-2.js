class Solution {
    findMax(n,nums, map){
        if(map[n] !== undefined){
            return map[n];
        }
        if(n < 0) return 0;
        if(n == 0) return nums[0];
        if(n == 1) return Math.max(nums[0],nums[1]);
        const max =  Math.max(nums[n]+this.findMax(n-2, nums, map), this.findMax(n-1, nums, map));
        map[n] = max;
        return max;
    }

    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        if(nums.length === 1){return nums[0];}
        const firstSet = nums.slice(1,nums.length);
        const secondSet = nums.slice(0,nums.length - 1);
        const map = {};
        const secondMap = {}
        return Math.max(this.findMax(firstSet.length - 1,firstSet,map),this.findMax(secondSet.length - 1,secondSet, secondMap));
    }
}
