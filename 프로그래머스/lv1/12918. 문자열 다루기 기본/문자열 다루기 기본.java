import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
            return Pattern.matches("^\\d{4}|{6}$", s);
    }
}