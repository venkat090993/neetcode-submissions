class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const valueIndexMap = {};
        for(let i = 0; i<nums.length; i++){
            valueIndexMap[nums[i]] = i;
        }

        for(let i = 0; i<nums.length; i++){
            const compliment = target - nums[i];
            if(valueIndexMap[compliment] && valueIndexMap[compliment] !== i){
                return [i, valueIndexMap[compliment]];
            }
        }
    }
}
