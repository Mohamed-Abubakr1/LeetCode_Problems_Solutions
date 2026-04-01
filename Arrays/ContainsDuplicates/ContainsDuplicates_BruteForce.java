/*
 * Brute Force Approach
 * Time Complexity: O(n ^ 2)
 * Space Complexity: O(1)
*/

public boolean containsDchangeMethodNameuplicate(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) return true;
        }
    }

    return false;
}
