class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length(); i ++){
            Integer count = map.get(s.charAt(i));
            if(count==null){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),count+1);
            }
        }
        for(int i = 0 ; i < s.length(); i ++){
            Integer count = map.get(s.charAt(i));
            if(count!=null){
                if(count==1)
                    return i;
            }
        }
        return -1;
    }
}
