class Solution {
    /**
     * state -> where I currently stand & conbination
     * 
     */
    dfs(nums, target, i, combination, currSum ,result){
        // if currSum is equeal to target -> I push the combination to the result
        // if currSum exceeds, I return without anything

        if (i >= nums.length) {
            return;
        }
        
        if(currSum > target){
            return;
        }

        if(currSum === target){
            result.push([...combination]);
            return;
        }

        // choose

        combination.push(nums[i]);

        // recurse

        this.dfs(nums, target, i, combination, currSum + nums[i], result);

        // remove choice

        combination.pop();

        // skip and recurse

        this.dfs(nums, target, i+1, combination, currSum, result);

    }


    /**
     * @param {number[]} nums
     * @param {number} target
     * @returns {number[][]}
     */
    combinationSum(nums, target) {
        const result = [];
        this.dfs(nums, target, 0, [], 0, result);
        return result;
    }
}
