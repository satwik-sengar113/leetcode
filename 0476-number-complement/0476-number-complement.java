class Solution {
    public int findComplement(int num) {
        if(num==0)
            return 1;
        int x=(int)(Math.log(num)/Math.log(2))+1;
        int bm=(1<<(x))-1;
        return bm^num;
    }
}