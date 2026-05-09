class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let new_string = ""
        for(let i = 0; i < strs.length; i++){
            const charLength = strs[i].length;
            new_string = new_string+charLength+"#"+strs[i];
        }
        return new_string;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        let i = 0;
        const result = [];
        while (i < str.length) {
        let j = i;

        // 1️⃣ read full number (can be multiple digits)
        while (str[j] !== "#") {
            j++;
        }

        const length = parseInt(str.slice(i, j));

        // 2️⃣ extract string of that length
        const word = str.slice(j + 1, j + 1 + length);
        result.push(word);

        // 3️⃣ move pointer
        i = j + 1 + length;
    }
        return result;
    }
}
