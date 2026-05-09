class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const freqCounter = {};
        for(let i = 0; i<nums.length; i++){
            if(freqCounter[nums[i]]){
                freqCounter[nums[i]]+=1;
            }else{
                freqCounter[nums[i]]=1;
            }
        }
        

        let maxCount = -Infinity;

        for(let key in freqCounter){
            maxCount = Math.max(maxCount,freqCounter[key]);
        }
        

        const bucket = Array.from({length: maxCount + 1},()=>[]);
        

      for(let key in freqCounter){
            const idx = freqCounter[key];
            bucket[idx].push(key)
        }
        
        // [ [], [ '1' ], [ '2', '3' ], [ '4' ] ]

    const res = [];
    
    for(let i = bucket.length - 1; i > 0 && res.length < k; i--){
        res.push(...bucket[i]);
    }
    
    return res;

        
    }
}
