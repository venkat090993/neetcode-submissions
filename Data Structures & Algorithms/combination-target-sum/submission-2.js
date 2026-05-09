/** 
    * state - 
    * @param index - where I stand
    * @param {number[]} nums
    * @param {number} target
    * @param {number[]} paths
    * @param {number[]} result - stores the result
*/
function backtrack(i, nums, target, paths, currentSum, result){
    if(currentSum > target){
        return;
    }

    if(i >= nums.length){
        return
    }

    if(currentSum === target){
        result.push([...paths]);
        return;
    }

    // choose
    paths.push(nums[i]);

    backtrack(i, nums, target, paths, currentSum + nums[i], result);

    paths.pop();

    backtrack(i+1, nums, target, paths, currentSum, result);

}

class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @returns {number[][]}
     */
    combinationSum(nums, target) {
        const result = [];
        backtrack(0, nums, target, [], 0, result);
        return result;
    }
}
