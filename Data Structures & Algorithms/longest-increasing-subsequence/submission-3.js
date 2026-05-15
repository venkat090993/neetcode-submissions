function binarySearch(stack, curr){
    let l = 0, r = stack.length - 1, result = -1;
    while(l <= r){
        const mid = Math.floor(l + (r-l)/2);
        if(stack[mid] < curr){
            l = mid + 1;
        } else if(stack[mid] >= curr){
            result = mid;
            r = mid - 1;
        }
    }

    return result;

}

class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    lengthOfLIS(nums) {
        let stack = [];
        stack.push(nums[0]);
        for(let i = 1; i<nums.length; i++){
            const prev = stack[stack.length - 1];
            if(prev !== undefined && prev >= nums[i]){
                const idx = binarySearch(stack,nums[i]);
                if(idx > -1){
                    stack[idx] = nums[i];
                }
            }else{
               stack.push(nums[i]); 
            }
        }
        return stack.length;
    }
}