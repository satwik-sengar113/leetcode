class Solution {
    public void pp(int index,int []nums,List<List<Integer>> ans){
        if(index==nums.length){
            ArrayList<Integer> li= new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                li.add(nums[i]);
            }
            ans.add(li);
            return ;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            pp(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    public void swap(int i,int j,int []nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    pp(0,nums,ans);
    return ans; 
    }
}