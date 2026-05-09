class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        // I should find the start of the sequence
        // Iterate further and update the maxCount

        const hashSet = new Set(nums);

        let maxLength = 0;

        for(let i = 0; i< nums.length; i++){
            // how I have to check if the prev el is there in the input.
            // I can check this from set
            let prev = nums[i] - 1;
            if(hashSet.has(prev)){
                continue;
            }else{
                // this el is start of a sequence
                let seqSize = 1;
                let curr = nums[i];
                while(hashSet.has(curr + 1)){
                        seqSize+=1;
                        curr+=1;
                }
                maxLength = Math.max(maxLength, seqSize);
            }
        }

        return maxLength;
        
    }
}
