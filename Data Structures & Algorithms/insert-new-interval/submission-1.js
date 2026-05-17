class Solution {
    /**
     * @param {number[][]} intervals
     * @param {number[]} newInterval
     * @return {number[][]}
     */
    insert(intervals, newInterval) {
        // consoidate array
        // sort array
        const consolidated_array = [...intervals, newInterval].sort((a,b)=>a[0] - b[0]);
        const stack = [consolidated_array[0]];
        for(let i = 1; i<consolidated_array.length; i++){
            const curr_start = consolidated_array[i][0];
            const curr_end = consolidated_array[i][1];

            const prev_start = stack[stack.length -1][0];
            const prev_end = stack[stack.length -1][1];

            if(curr_start > prev_end){
                stack.push(consolidated_array[i]);
            }else{
                stack.pop();
                const new_interval_start = prev_start < curr_start ? prev_start :curr_start;
                const new_interval_end = prev_end > curr_end ? prev_end :curr_end;
                const new_interval = [new_interval_start, new_interval_end];
                stack.push(new_interval);
            }
        }
    
        return stack;
    }
}
