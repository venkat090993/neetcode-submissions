class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        // hasmap -> freqCounterArrayString -> key, value -> add it as value
        const hashKeyToCounterVal = {};
        for(let i = 0; i< strs.length; i++){
            const charArr = new Array(26).fill(0);
            for(let j = 0; j<strs[i].length; j++ ){
                charArr["z".charCodeAt(0) - strs[i][j].charCodeAt(0)] += 1;
            }
            const hashKey = charArr.join("#");

            if(hashKeyToCounterVal[hashKey]){
                hashKeyToCounterVal[hashKey].push(strs[i]);
            }else{
                hashKeyToCounterVal[hashKey] = [];
                hashKeyToCounterVal[hashKey].push(strs[i]);
            }
        }
        return Object.values(hashKeyToCounterVal)
    }
}
