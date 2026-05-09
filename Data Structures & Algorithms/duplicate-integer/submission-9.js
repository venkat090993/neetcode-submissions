class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        var uniqueSet = new Set();
        for(var i = 0; i< nums.length; i++){
            if(uniqueSet.has(nums[i])){
                return true;
            }else{
                uniqueSet.add(nums[i]);
            }
        }
        return false;
    }
}
