class Solution {
    /**
     * @param {number[]} cost
     * @return {number}
     */

    map={}

    findCost(n, cost){
        if(this.map[n] !== undefined){
            return this.map[n];
        }

        if(n < 0 ) return 0;
        if(n === 0 || n === 1){
            return cost[n];
        }
        const costToReachnthStep =  cost[n] + Math.min(this.findCost(n-1, cost),this.findCost(n-2, cost));
        this.map[n] = costToReachnthStep;
        return costToReachnthStep
    }

    minCostClimbingStairs(cost) {
        const n = cost.length;
        return Math.min(this.findCost(n-1, cost),this.findCost(n-2, cost));
    }
}
