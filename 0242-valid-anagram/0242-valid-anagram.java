class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character , Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char a =t.charAt(i);
            if(!map.containsKey(a)) return false;
            else{
                map.put(a,map.get(a)-1);
            }
            if(map.get(a)==0) map.remove(a);
        }
        if(map.size()==0) return true;
        return false;
    }
}