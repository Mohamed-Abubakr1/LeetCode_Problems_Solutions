/*
 * Hash Set Approach
 * Time Complexity: O(n)
 * Space Complexity: O(n)
*/

public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
        int number = nums[i];

        if (seen.contains(number)) return true;
        seen.add(number);
    }

    return false;
}
