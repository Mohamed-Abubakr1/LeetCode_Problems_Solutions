/*
* Brute Force Approach
* Time Complexity: O(n ^ 2)
* Space Complexity: O(1)
*/

public int[] twoSum(int[] nums, int target) {
    int[] ans = new int [2];

    for (int i = 0; i < nums.length - 1; i++) {
        int v1 = nums[i];
    
        for (int j = i + 1; j < nums.length; j++) {
            if (v1 + nums[j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }
     }

     return ans;
}
