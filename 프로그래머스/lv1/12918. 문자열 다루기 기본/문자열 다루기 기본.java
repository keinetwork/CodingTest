import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length()==6){
            return Pattern.matches("^\\d*$", s);    
        }
        return false;
    }
}