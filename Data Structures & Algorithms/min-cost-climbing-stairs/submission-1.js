

class Solution {
    /**
     * @param {number[]} cost
     * @return {number}
     */

    map = {}

    minCostToClimb(cost, n){
    if(this.map[n]) return this.map[n];
    if(n < 0 ) return 0;
    if(n == 0 || n == 1) return cost[n];
    let costToReachN =  cost[n] + Math.min(this.minCostToClimb(cost,n-1) , this.minCostToClimb(cost,n-2));
    this.map[n] = costToReachN;
    return costToReachN;
    }

    minCostClimbingStairs(cost) {
        let n = cost.length;
        return Math.min(this.minCostToClimb(cost, n-1), this.minCostToClimb(cost, n-2))
    }
}
