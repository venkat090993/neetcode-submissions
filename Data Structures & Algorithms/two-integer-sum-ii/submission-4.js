class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     */
    twoSum(numbers, target) {
        // It is sorted, and I want to find the index. I can use 2 pointers
        let l = 0, r = numbers.length - 1;
        while(l<r){
            // if sum of 2 numbers at index l and r matches the target return
            if(numbers[l] + numbers[r] === target){
                return [l+1,r+1];
            }else if(numbers[l] + numbers[r] > target){
                r--;
            }else{
                l++
            }
        }
        return [-1,-1];
    }
}
