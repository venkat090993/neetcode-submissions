class Solution {
    /**
     * @param {number} x
     * @return {number}
     */
    reverse(x) {
        let reverse = ""
        let isNegative = false;
        if(x > 0){
            reverse = `${x}`.split('').reverse().join('');
        }

        if(x < 0){
        isNegative = true
        reverse = `${x}`.slice(1).split('').reverse().join('');
        }

        const parsed = Number(reverse);
        if(parsed > 2147483647 || parsed < -2147483647){
            return 0
        }

        return isNegative ? Number(`-${parsed}`) : parsed;
    }
}
