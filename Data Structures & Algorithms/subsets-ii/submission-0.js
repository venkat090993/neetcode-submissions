function dfs(i, path, nums, result){
    // what is the base condition
    // Hey, I want to return where there are no choices to make ( end of the array)
    if(i > nums.length){
        return;
    }

     result.push([...path]);

    for(let j = i; j < nums.length; j++){
        if(j > i && nums[j] === nums[j-1]){
            continue;
        }
        path.push(nums[j]);
        dfs(j+1, path, nums, result);
        path.pop();
    }
}

class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    subsetsWithDup(nums) {
        const result = [];
        dfs(0, [], nums.sort((a,b)=> a-b), result);
        return result;
    }
}
