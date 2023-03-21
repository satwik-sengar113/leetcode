class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int index = -1;
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i]==0){
                ans = ans + i - index;
            }
            else
                index=i;
        }
        return ans;
    }
}