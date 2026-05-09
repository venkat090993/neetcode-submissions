class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        // for( var i = 0; i<nums.length; i++){
        //     for(var j = i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return [i,j];
        //         }
        //     }
        // }

        var valueIndexMap = new Map();
        for(var i=0; i<nums.length; i++){
            var valueIdx = valueIndexMap.get(target - nums[i]);
            if(valueIdx !== undefined && valueIdx !== i){
                return [valueIdx, i];
            }
            else{
                valueIndexMap.set(nums[i], i);
            }
        };
    }
}
