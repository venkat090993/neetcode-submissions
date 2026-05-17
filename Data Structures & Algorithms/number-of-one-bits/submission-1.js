class Solution {
    /**
     * @param {number} n - a positive integer
     * @return {number}
     */
    hammingWeight(n) {
        let result = 0;
        while(Number(n) !== 0){
            result = result + (n & 1);
            n >>= 1;
        }
        return result;

    }
}
