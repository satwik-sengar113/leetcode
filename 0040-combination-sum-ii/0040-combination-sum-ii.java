class Solution {
    public static void fc(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> li){
        if(target==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            li.add(arr[i]);
            fc(i+1,arr,target-arr[i],ans,li);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        fc(0,candidates,target,ans,new ArrayList<>());
        return ans;    
    }
}