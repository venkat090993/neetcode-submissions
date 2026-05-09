class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // I know that max rate that I can pick is the maximum banan in the pile
        // min can be 1. So i maintain this as value and then do a binary search on the ans range
        // have a global k rate and return

        int max = Integer.MIN_VALUE;
        for(int pile: piles){
            max = Math.max(max, pile);
        }
        
        int l = 1;
        int r = max;
        int ans = max;
        while(l<=r){
            int mid = l + ((r-l)/2);
            int tte = 0;
            for(int i = 0; i< piles.length; i++){
                // math.ciel ( a + b - 1) / b;
                 tte += ( piles[i] + mid - 1 )/mid;
            }

            if(tte <= h){
                ans = Math.min(ans, mid);
                r = mid - 1;
            }else{
                l = mid + 1;
            }

        }

        return ans;
    }
}
