class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int s=-1;
        String type = "type" ;
        String color = "color" ;
        String name = "name" ;
        if(ruleKey.equals(type)){
            s=0;
        }
        else if(ruleKey.equals(color)){
            s=1;
        }
        else if(ruleKey.equals(name)){
            s=2;
        }
        int count=0;
        for(int i =0;i<items.size();i++){
            List <String> arr=items.get(i);
            if(arr.get(s).equals(ruleValue))
                count++;
        }
        return count;
        
    }
}