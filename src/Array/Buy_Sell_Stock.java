package Array;

public class Buy_Sell_Stock {
    public  static  int buyAndSellStock(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i=0;i<price.length;i++){
            if(buyPrice<price[i]){
                int p=price[i]-buyPrice;
                maxProfit=Math.max(maxProfit,p);
            }else {
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(price));

    }
}
