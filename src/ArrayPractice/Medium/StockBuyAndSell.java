package ArrayPractice.Medium;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit= findMaxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int findMaxProfit(int[] prices) {
        int maxProfit=0;
        int min = prices[0];
        for(int price: prices){
            if(price<min){
                min=price;
            }
            else {
                maxProfit = Math.max(maxProfit,price-min);
            }
        }
        return maxProfit;
    }
}
