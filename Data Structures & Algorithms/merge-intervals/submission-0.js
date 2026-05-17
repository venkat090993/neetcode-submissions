class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number[][]}
     */
    merge(intervals) {
        const sorted_intervals = intervals.sort((a,b)=> a[0] - b[0]);
        const stack = [sorted_intervals[0]];
        for(let i = 0; i<sorted_intervals.length; i++){
            const prev_start = stack[stack.length - 1][0];
            const prev_end = stack[stack.length - 1][1];

            const curr_start = sorted_intervals[i][0];
            const curr_end = sorted_intervals[i][1];

            if(curr_start > prev_end){
                stack.push(sorted_intervals[i]);
            }else{
                stack.pop();
                const new_interval_start = Math.min(prev_start, curr_start);
                const new_interval_end = Math.max(prev_end, curr_end);
                stack.push([new_interval_start,new_interval_end]);
            }
        }
        return stack;
    }
}
