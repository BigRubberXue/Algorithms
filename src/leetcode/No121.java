package leetcode;
class No121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len<1){
            return 0;
        }
        int dp = prices[0];
        int maxL=0;
        for(int price:prices){
            if(price>dp){
                price=price-dp;
            }else{
                dp=price;
                price=-price;
            }
            maxL=Math.max(maxL,price);
        }
        return maxL;
    }
}