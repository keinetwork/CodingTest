import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return String.format("김서방은 %d에 있다", x);
    }
}