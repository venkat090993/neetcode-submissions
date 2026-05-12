class Solution {
    /**
     * @param {number} n
     * @return {number}
     */
    map={}
    climbStairs(n) {
        if(this.map[n]!==undefined)return this.map[n]
        if(n < 0 ) return 0;
        if(n === 0 || n === 1) return 1;
        const ways = this.climbStairs(n-1) + this.climbStairs(n-2);
        this.map[n]=ways;
        return ways;
    }
}
