class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int max_profit[] = new int[prices.length];
        int max_profit_idx[] = new int[prices.length];

        for(int i = 0; i < prices.length - 1; i++) {
            max_profit[i] = 0;
            for(int j = i + 1; j < prices.length;j++) {
                if(max_profit[i] < prices[j] - prices[i]) {
                    max_profit[i] = prices[j] - prices[i];
                }
            }
        }
        int max = 0;
        for(int i = 0; i < max_profit.length; i++) {
            if(max < max_profit[i]) {
                max = max_profit[i];
            }
        }

        return max;
    }

    public static void main(String []args) {
        int prices[] = {897,265,201,86,56,657,273,25,843,625,641,332,509,463,496,97,779,241,970,665,87,765,276,442,25,311,10,765,224,465,296 };
        int ans = maxProfit(prices);
        System.out.println("Max: " + ans);
    }
}
