class Solution {
    public boolean checkIfPangram(String s) {
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for( char c : s.toCharArray()){
            if(c>='a' && c<='z'){
                set.add(c);
            }
        }   return set.size()==26;
    }
        
}
