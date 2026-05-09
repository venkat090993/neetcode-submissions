
function dfs(start, paths, sum, candidates, target, result){

    if(start > candidates.length){
        return;
    }

    if(sum > target){
        return;
    }

    if( sum === target){
        result.push([...paths])
    }

    for(let i = start; i<candidates.length; i++){
        if(i > start && candidates[i] === candidates[i-1]){
            continue;
        }
        paths.push(candidates[i]);
        dfs(i+1, paths, sum + candidates[i], candidates, target, result);
        paths.pop();
    }


}

class Solution {

    /**
     * @param {number[]} candidates
     * @param {number} target
     * @return {number[][]}
     */
    combinationSum2(candidates, target) {
        const result = [];
        dfs(0, [], 0, candidates.sort((a,b)=>a-b), target, result);
        return result;
    }
}
