class Solution {

    map = {}

    findMax(nums,n){

        if(this.map[n]!== undefined) return this.map[n];

        if( n === 0){
            return nums[0];
        }

        if(n === 1){
            return Math.max(nums[1], nums[0]);
        }

        if(n<0){
            return 0;
        }

        const maxRob =  Math.max(nums[n]+this.findMax(nums,n-2), this.findMax(nums, n-1));
        this.map[n] = maxRob;
        return maxRob;
    }

    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        const n = nums.length - 1;
        return this.findMax(nums,n)
    }
}
