class Solution {
    public String solution(String s) {
        return s.substring((int)Math.ceil(s.length()/2.f-1), s.length()/2+1);
    }
}