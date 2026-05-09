class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int i = 0;
        int k = heights.length - 1;

        while(i < k){
            // container with most water is nothing but a rectagle area
            // area of rectangle is length * height
            // height is minimum of heights[i] and heights[j]
            // length is difference between the indices (i and j)
            int height = Math.min(heights[i],heights[k]);
            int length = k - i;
            int area = height * length;
            maxArea = Math.max(maxArea, area);
            if(heights[i] <= heights[k]){
                i++;
            }else{
                k--;
            }
        }
        return maxArea;
    }
}
