package week10;

import java.util.*;

public class BestTimetoBuyandSellStock {

    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    // You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
    // in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
    // If you cannot achieve any profit, return 0.
    // Example 1: Input: prices = [7,1,5,3,6,4] Output: 5
    // Explanation:
    // Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling
    // on day 1 is not allowed because you must buy before you sell.
    // Example 2: Input: prices = [7,6,4,3,1] Output: 0
    // Explanation:
    // In this case, no transactions are done and the max profit = 0. Constraints: 1 <= prices.
    // length <= 105 0 <= prices[i] <= 104
    //Please, test your solution here: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

    public static int bestTimetoBuyandSellStock(int[] prices){

        int min = Arrays.stream(prices).min().orElse(0);

        Map<Integer,Integer> mapTemp = new LinkedHashMap<>();
        for (int i = 0; i < prices.length; i++) {
            mapTemp.put(prices[i], i);
        }

        int indexOfmin = mapTemp.get(min);
        int[] newArr = null;
        if (indexOfmin==prices[prices.length-1]) return 0;
        else {
            newArr = Arrays.copyOfRange(prices, indexOfmin, prices.length);
        }

        int max = Arrays.stream(newArr).max().orElse(0);

        return max - min;

    }

    public static int bestTimetoBuyandSellStock1(int[] prices){
        if (prices == null || prices.length == 0) return 0;

        int maxProfit = 0;
        int minPrice = prices[0];

        for(int price : prices){
            minPrice = Math.min(minPrice, price);
           maxProfit = Math.max(maxProfit, price-minPrice);
            //maxProfit = Math.max(maxProfit, minPrice);
        }

        return maxProfit;
    }



        public static void main(String[] args) {

        //int[] arr = {7,1,5,3,6,4};
        int[] arr = {2,4,1};

        System.out.println("bestTimetoBuyandSellStock(arr) = " + bestTimetoBuyandSellStock(arr));
        System.out.println("bestTimetoBuyandSellStock1(arr) = " + bestTimetoBuyandSellStock1(arr));

    }

}
