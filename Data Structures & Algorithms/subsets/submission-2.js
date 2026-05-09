function dfs(i, paths, nums, result){
    if(i === nums.length){
        result.push([...paths]);
        return;
    }
    // choose
    paths.push(nums[i]);

    // Recurse
    dfs(i+1, paths, nums, result);

    // remove the last choice
    paths.pop();


    // I skip and traverse
    dfs(i+1, paths, nums, result);
}


class Solution {
    


    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    subsets(nums) {
        const result = [];
        dfs(0, [], nums, result);
        return result;
    }
}
