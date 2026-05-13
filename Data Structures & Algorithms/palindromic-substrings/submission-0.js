class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    countSubstrings(s) {
        if(s.length === 1){
            return 1;
        }

        let max = 0;

        for(let i = 0; i<s.length; i++){
                let o_l = i, o_r = i;
                while(o_l >= 0 && o_r < s.length){
                    if(s[o_l] === s[o_r]){
                        console.log(max,"max")
                        max++;
                        o_l--;
                        o_r++;
                    }else{
                        break;
                    }
                }

            let e_l = i, e_r = i+1;
            while(e_l >=0 && e_r < s.length){
                if(s[e_l] === s[e_r]){
                    max++;
                    e_l--;
                    e_r++;
                }else{
                    break;
                }
            }
        }
        return max;
    }
}
