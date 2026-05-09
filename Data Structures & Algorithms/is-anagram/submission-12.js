class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;
        const freqCounter = {};
        for(let i = 0; i<s.length; i++){
            if(freqCounter[s[i]]){
                freqCounter[s[i]]+=1;
            }else{
                freqCounter[s[i]] = 1;
            }
        }

        for(let j = 0; j < t.length; j++){
            if(freqCounter[t[j]] == 0 ||freqCounter[t[j]] == undefined){
                return false;
            }else if(freqCounter[t[j]]){
                freqCounter[t[j]]-=1;
            }
        }

        return true;
       
    }
}
