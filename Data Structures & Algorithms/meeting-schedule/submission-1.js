/**
 * Definition of Interval:
 * class Interval {
 *   constructor(start, end) {
 *     this.start = start;
 *     this.end = end;
 *   }
 * }
 */

class Solution {
    /**
     * @param {Interval[]} intervals
     * @returns {boolean}
     */
    canAttendMeetings(intervals) {
        if(intervals.length === 0){
            return true;
        }
        const sorted_intervals = intervals.sort((a,b)=>{
            if(a.start !== b.start){
                return a.start -b.start;
            }else{
                return a.end - b.end;
            }
        })
        console.log(sorted_intervals)
        let prev_start = sorted_intervals[0].start;
        let prev_end = sorted_intervals[0].end;
       for(let i = 1; i<sorted_intervals.length; i++ ){
            const curr = sorted_intervals[i];
            const curr_start = curr.start;
            const curr_end = curr.end;

            if(curr_start >= prev_end){
                prev_start = curr_start;
                prev_end = curr_end;
            }else{
                return false;
            }
       }
       return true;
    }
}
