class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count =1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            else if (nums[i]-nums[i+1]==-1)
            {
                count++;
                res=Math.max(res,count);
            }
            else
            {
                count=1;
            }
        }
        res=Math.max(res,count);
        if(res==Integer.MIN_VALUE || nums.length==0)
        {
            return 0;
        }
        return res;
        
    }
}