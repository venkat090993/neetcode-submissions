class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */

    /**
     * State - input, current index ( where do i stand) & path ( what have I choosen until now)
     */
    dfs(nums,i,path, result){ 
        if(i === nums.length){
            result.push([...path]);
            return;
        }

        // choose
        path.push(nums[i]);

        // recurse
        this.dfs(nums, i+1, path, result);

        // remove curr el as choice

        path.pop();

        // skip and reverse
        this.dfs(nums, i+1, path, result);

    }

    subsets(nums) {
        const result = [];
        this.dfs(nums, 0, [], result);
        return result;
    }
}
