class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let result = ""
        for(let i = 0; i<strs.length; i++){
            result = result+strs[i].length+"#"+strs[i];
        }
        return result;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
    // 16#Hellohe l  l  o  h  e  l  l  o  e  5  #  W  o  r  l d
    // 0123456789 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        let f_idx = 0, e_idx = 0;
        const result = [];

        while(e_idx < str.length){
            if(str[e_idx] === "#"){
                let count = Number(str.slice(f_idx, e_idx));
                const decodedString = str.slice(e_idx+1, e_idx+count+1);
                result.push(decodedString);
                f_idx = e_idx + count + 1;
                e_idx = e_idx + count + 1;
            }else{
                e_idx+=1;
            }
        }

        return result;

    }
}
