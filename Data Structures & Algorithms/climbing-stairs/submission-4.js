class Solution {
    /**
     * @param {number} n
     * @return {number}
     */

    map={}; // index : value => if index 

    climbStairs(n) {
        if(this.map[n]){
            return this.map[n];
        }

        if(n==1 || n == 0){
            return 1;
        }

        if(n<0){
            return 0;
        }

        let result =  this.climbStairs(n-1) + this.climbStairs(n-2);
        this.map[n] = result;
        return result;
    }
}
