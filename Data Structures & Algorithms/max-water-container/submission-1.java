class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;
        while(l<r){
            // I want the height and width
            // in a graph how do you find the width it is x2 - x1
            // here it is last index ( r ) - first index ( l )

            int width = r - l;
            int height = Math.min(heights[l],heights[r]);
            int area = height * width;
            maxArea = Math.max(area, maxArea);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        };
        return maxArea;
    }
}
