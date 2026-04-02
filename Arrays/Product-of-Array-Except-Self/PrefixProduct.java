/*
 * Prefix Product Approach
 * Time Complexity: O(n)
 * Space Complexity: O(n) "to store the result array"
 */

public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int zeroCount = 0; // Not strictly required, but provides an early exit for specific edge cases.

    int currentProduct = 1;

    // First Pass: Prefix Product
    for (int i = 0; i < n; i++) {
        if (nums[i] == 0) {
            zeroCount++;
            if (zeroCount == 2) {
                return new int[n];
            }
        }

        result[i] = currentProduct;
        currentProduct *= nums[i];
    }

    currentProduct = 1;

    // Second Pass: Suffix Product
    for (int i = n - 1; i >= 0; i--) {
        result[i] *= currentProduct;
        currentProduct *= nums[i];
    }

    return result;
}
