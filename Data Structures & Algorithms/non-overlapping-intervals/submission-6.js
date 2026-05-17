class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number}
     */
    eraseOverlapIntervals(intervals) {
        const sorted_intervals = intervals.sort((a,b)=> {
            if(a[0] !== b[0]){
                return a[0] - b[0];
            }else{
                return a[1] - b[1];
            }
        });
        const stack = [sorted_intervals[0]];
        console.log(sorted_intervals)
        let min_interval = 0;
        for(let i = 1; i<sorted_intervals.length; i++){
            const prev_interval = stack[stack.length - 1];
            const curr_interval = sorted_intervals[i];
            const prev_end = prev_interval[1];
            
            const curr_start = curr_interval[0];
            const curr_end = curr_interval[1];

            if(curr_start >= prev_end){
                stack.push(curr_interval);
            }else{
                if(curr_end < prev_end){
                    const interval = stack.pop();
                    interval[1] = curr_end;
                    stack.push(interval);
                }
                min_interval+=1;
            }
        }
        return min_interval;
    }
}
