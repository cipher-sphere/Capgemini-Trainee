class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        int left=0;
        int right=numbers.length-1;
        while(right>=left){
           if(numbers[left]+numbers[right]==target){
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
            else if(target>numbers[left]+numbers[right]){
                left=left+1;
            }
            else{
                right=right-1;
            }
        }
        return ans;
    }
}