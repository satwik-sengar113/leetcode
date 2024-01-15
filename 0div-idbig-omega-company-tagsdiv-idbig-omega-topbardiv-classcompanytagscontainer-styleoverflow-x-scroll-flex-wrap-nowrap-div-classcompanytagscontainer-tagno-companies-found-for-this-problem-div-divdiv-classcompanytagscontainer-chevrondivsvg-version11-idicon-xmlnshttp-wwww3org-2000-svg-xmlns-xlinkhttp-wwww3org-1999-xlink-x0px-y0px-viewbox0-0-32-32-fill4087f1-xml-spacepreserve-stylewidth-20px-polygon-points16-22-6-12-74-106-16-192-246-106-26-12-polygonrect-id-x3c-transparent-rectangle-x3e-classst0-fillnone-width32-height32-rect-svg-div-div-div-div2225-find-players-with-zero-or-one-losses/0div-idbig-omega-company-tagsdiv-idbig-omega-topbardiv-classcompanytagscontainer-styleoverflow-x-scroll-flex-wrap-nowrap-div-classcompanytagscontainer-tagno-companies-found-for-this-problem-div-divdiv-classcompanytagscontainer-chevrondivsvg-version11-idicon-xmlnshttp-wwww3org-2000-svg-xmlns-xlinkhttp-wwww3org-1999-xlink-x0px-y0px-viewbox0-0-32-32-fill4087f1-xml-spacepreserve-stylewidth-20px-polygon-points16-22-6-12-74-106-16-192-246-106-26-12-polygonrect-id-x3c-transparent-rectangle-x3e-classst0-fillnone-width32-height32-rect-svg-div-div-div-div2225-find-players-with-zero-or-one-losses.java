class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
         List<List<Integer>> ans = new ArrayList<>();
         find(ans,matches);
         return ans;    
    }
    public void find(List<List<Integer>> ans,int[][] matches){
        int[] arr = new int[100001];
        boolean[] a = new boolean[100001];
        for(int i = 0;i<matches.length;i++){
            arr[matches[i][1]]++;
            a[matches[i][0]]=true;
            a[matches[i][1]]=true;
        }
//        System.out.println(Arrays.toString(arr));
        List<Integer> win = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i  = 1;i<arr.length;i++){
            if(arr[i]==0&&a[i]){
                win.add(i);
            }
            if(arr[i]==1){
                l.add(i);
            }
        }
        ans.add(win);
        ans.add(l);
    }
}