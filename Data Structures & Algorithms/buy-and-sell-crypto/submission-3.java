class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0, j = 1;
        while(j <= prices.length - 1){
            int day_1_price = prices[i];
            int day_2_price = prices[j];
            if(day_1_price >= day_2_price){
                i = j;
                j++;
            }
            if(day_2_price > day_1_price){
                int currentDayProfit = day_2_price - day_1_price;
                maxProfit = Math.max(maxProfit, currentDayProfit);
                j++;
            }
        }
        return maxProfit;
    }
}
