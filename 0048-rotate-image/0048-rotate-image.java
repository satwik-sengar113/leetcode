class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int low=0,high=n-1;
        while(low<high){
            for(int i=0;i<n;i++){
                swap(matrix,low,i,high,i);
            }
            low++;
            high--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                swap(matrix,i,j,j,i);
            }
        }
        
    }
    public static void swap(int[][] matrix,int r1,int c1,int r2,int c2){
        int temp=matrix[r2][c2];
        matrix[r2][c2]=matrix[r1][c1];
        matrix[r1][c1]=temp;
    }
}