function dfs(path, nums, result, visited){
    if(path.length === nums.length){
    result.push([...path]);
    return;
    }

    for(let j = 0; j<nums.length; j++){
        if(visited[j] === 1){
            continue;
        }
        visited[j] = 1;
        path.push(nums[j]);
        dfs(path,nums,result, visited);
        path.pop();
        visited[j]=0;
    }
}

class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    permute(nums) {
        const result = [];
        let visited = Array(nums.length).fill(0);
        dfs([], nums, result, visited);
        return result;
    }
}
