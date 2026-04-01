/*
 * Two Pointers Approach
 * Time Complexity: O(n)
 * Space Complexity: O(1)
*/

public int maxProfit(int[] prices) {
    int max = 0;
    int left = 0;
    int right = 1;

    while (right < prices.length) {
        if (prices[right] < prices[left]) left = right;
        else {
            if (prices[right] - prices[left] > max) max = prices[right] - prices[left];
        }

        right++;
    }

    return max;
}
