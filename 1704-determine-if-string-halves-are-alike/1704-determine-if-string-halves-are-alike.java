class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<n/2;i++){
            sb1.append(s.charAt(i));
        }
        for(int i=n/2;i<n;i++){
            sb2.append(s.charAt(i));
        }
        int count1=0,count2=0;
       for (int i = 0; i < sb1.length(); i++) {
            if (Character.isUpperCase(sb1.charAt(i))) {
                sb1.setCharAt(i,
                        Character.toLowerCase(sb1.charAt(i)));
            }
        }
        for (int i = 0; i < sb2.length(); i++) {
            if (Character.isUpperCase(sb2.charAt(i))) {
                sb2.setCharAt(i,
                        Character.toLowerCase(sb2.charAt(i)));
            }
        }
        for(int i=0;i<n/2;i++){
            char ch1=sb1.charAt(i);
            char ch2=sb2.charAt(i);
            if(ch1 == 'a'||ch1 == 'e'|| ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
                count1++;
            if(ch2 == 'a'||ch2 == 'e'|| ch2 == 'i' || ch2 == 'o' || ch2 == 'u')
                count2++;
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}