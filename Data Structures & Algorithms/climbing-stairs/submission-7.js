class Solution {
    map={};
    /**
     * @param {number} n
     * @return {number}
     */
    climbStairs(n) {
        if(this.map[n] != undefined){
            return this.map[n];
        }
        if(n < 0){
            return 0;
        }

        if(n === 0 || n === 1){
            return 1;
        }

        const result =  this.climbStairs(n-1) + this.climbStairs(n-2);
        this.map[n] = result;
        return result;

    }
}
