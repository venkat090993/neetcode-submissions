class Solution {

    hammingWeight(n){
        let count = 0;
        while(n !== 0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    /**
     * @param {number} n
     * @return {number[]}
     */
    countBits(n) {
        const result = []
        while(n>=0){
            result.push(this.hammingWeight(n));
            n-=1;
        }
        return result.reverse();
    }
}
