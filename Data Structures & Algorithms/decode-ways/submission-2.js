


function dfs(i, str, map){
    if(map[i]!==undefined) return map[i]
    // this means that I have completed checking all combinations
    if(i >= str.length){
        return 1;
    }

    if(str[i] == "0"){
        return 0;
    }

    let ways = 0;

    ways+= dfs(i+1,str, map);

    if(i+1 < str.length &&
     (str[i] === "1" && Number(str[i+1]) < 10) || 
     str[i] === "2" && Number(str[i+1]) < 7){
        ways+=dfs(i+2,str, map);
    }

    map[i] = ways;

    return ways;
}

class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    numDecodings(s) {
        const map = {};
        return dfs(0,s, map);
    }
}
