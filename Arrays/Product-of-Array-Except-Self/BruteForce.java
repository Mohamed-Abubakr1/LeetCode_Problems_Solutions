/*
 * Brute Force Approach (Note: Will likely cause TLE on LeetCode)
 * Time Complexity: O(n ^ 2)
 * Space Complexity: O(n) to store the result array
 */

public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
        int currentProduct = 1;

        for (int j = 0; j < n; j++) {
            if (i == j) {
                continue;
            }
            currentProduct *= nums[j];
        }

        result[i] = currentProduct;
    }

    return result;
}
