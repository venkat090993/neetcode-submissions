class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        var set = new Set(nums);
        if(nums.length === [...set].length){
            return false;
        }
        return true
    }
}
