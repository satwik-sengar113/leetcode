class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            int temp=indices[i];
            ch[temp]=s.charAt(i);
        }
        return new String(ch);
    }
}