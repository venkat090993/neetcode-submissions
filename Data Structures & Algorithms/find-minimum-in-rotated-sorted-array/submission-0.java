class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length -1;
        while(l<h){ // this is not finding k, it is finding a boundary ( min ). so we need segment of 1, so not l<=r
        int mid = l + ((h-l)/2);
        if(nums[mid]>nums[h]){
            l=mid+1;
        }else{
            h=mid; // We are trying to find min, mid can be min, so, we should not discard it
        }
        }
        return nums[h];
    }
}
