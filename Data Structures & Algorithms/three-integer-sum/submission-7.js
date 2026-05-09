class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        // I sort
        // have 1 stable pointer and then 2 pointers
        // [-4,-1,-1,0,1,2]
        // 

        const sortedArr = [...nums].sort((a,b)=>a-b);
        const res = [];
        for(let i = 0; i<sortedArr.length; i++){
            if(i > 0 && sortedArr[i] === sortedArr[i-1]){
                continue;
            }
            let l = i+1, r = sortedArr.length - 1;
           while(l < r){
            const sum = sortedArr[i] + sortedArr[l] + sortedArr[r]
            if(sum === 0){
                res.push([sortedArr[i] , sortedArr[l] , sortedArr[r]]);
                l++;
                r--;

                while(l<r && sortedArr[l] === sortedArr[l-1]){
                    l++;
                }

                while(l<r && sortedArr[r] === sortedArr[r+1]){
                    r--;
                }
            }else if(sum < 0){
                l++;
            }else{
                r--;
            }
           }
        }

        return [...res];

    }
}
