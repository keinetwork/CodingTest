import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            list.add(s.charAt(i));
        }
        list.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}