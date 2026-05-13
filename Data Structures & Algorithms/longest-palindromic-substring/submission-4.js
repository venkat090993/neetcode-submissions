class Solution {
    /**
     * @param {string} s
     * @return {string}
     */
    longestPalindrome(s) {
        let longest = "";
        for(let i = 0; i<s.length;i++){
            let o_l = i, o_r = i;
            while(o_l >= 0 && o_r < s.length){
                if(s[o_l] === s[o_r]){
                    if(o_r - o_l + 1 > longest.length){
                        longest = s.slice(o_l,o_r+1);
                    }
                o_l--;
                o_r++;
                }else{
                    break;
                }
            }

            let e_l = i, e_r = i+1;
            while(e_l >= 0 && e_r < s.length){
                if(s[e_l] === s[e_r]){
                    if(e_r - e_l + 1 > longest.length){
                        longest = s.slice(e_l,e_r+1);
                    }
                e_l--;
                e_r++;
                }else{
                    break;
                }
            }
        }
        return longest;
    }
}
