class Solution {
    public int longestOnes(int[] nums, int k) {

        int countzeros = 0;
        int ans = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                countzeros++;
            }

            while (countzeros > k) {
                if (nums[left] == 0) {
                    countzeros--;
                }
                left++;
            }

            ans = Math.max(ans, i - left + 1);
        }

        return ans;
    }
}