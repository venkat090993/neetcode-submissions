class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;
        var freqMap = {};
        for(var ch of s){
            if(freqMap[ch]){
                freqMap[ch]+=1;
            }else{
                freqMap[ch] = 1;
            }
        }

        for(var ch of t){
            if(!freqMap[ch] || freqMap == 0){
                return false;
            }else{
                freqMap[ch] -= 1;
            }
        }

        return true;
    }
}
