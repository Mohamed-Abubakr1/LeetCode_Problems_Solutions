/*
 * Bit Manipulation Approach (XOR)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public int missingNumber(int[] nums) {
    int xorSum = nums.length;
    
    for (int i = 0; i < nums.length; i++) {
        xorSum ^= (i ^ nums[i]);
    }
    
    return xorSum;
}
