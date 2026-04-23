class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int l=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(!set.add(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            maxlen=maxlen>i-l+1 ? maxlen:i-l+1;
        }
        return maxlen;
    }
}
