class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int j=0;
        for(int i = 1;i<nums.length;i++){
            while(nums[i]-nums[j]>1){
                j++;
            }
            if(nums[i]-nums[j]==1&&i-j+1>ans){
                
                ans = (i-j+1);
            }
        }
        return ans;

    }
}