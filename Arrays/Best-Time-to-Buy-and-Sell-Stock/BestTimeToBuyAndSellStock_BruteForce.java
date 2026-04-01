/*
 * Brute Force Approach
 * Time Complexity: O(n ^ 2)
 * Space Complexity: O(1)
*/

public int maxProfit(int[] prices) {
    int max = 0;

    for (int i = 0; i < prices.length - 1; i++) {
        int buy = prices[i];

        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] - buy > max) max = prices[j] - buy;
        }
    }
  
    return max;
}
