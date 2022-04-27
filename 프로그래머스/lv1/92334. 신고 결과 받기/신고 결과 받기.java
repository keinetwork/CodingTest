import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int usize = id_list.length;
        int[] answer = new int[usize];  // 신고결과 메일 회신 횟수
        
        Map<String, Set<String>> act = new HashMap<>(); 	// 신고한 횟수
        Map<String, Set<String>> react = new HashMap<>();	// 신고당한횟수
        Map<String, Integer> mcount = new HashMap<>();        // 정지된 신고 아이디수, 메일 받은수
        
        for (int i=0; i<usize; i++) {
        	act.put(id_list[i], new HashSet<>());
        	react.put(id_list[i], new HashSet<>());
        	mcount.put(id_list[i], 0);
        }
        
        for (int i=0; i<report.length; i++) {
            String[] rs = report[i].split(" ");
            Set<String> funch = act.get(rs[0]);
            funch.add(rs[1]);
            Set<String> defunch = react.get(rs[1]);
            defunch.add(rs[0]);
        }
        
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i=0; i<usize; i++) {
        	Set<String> reget = react.get(id_list[i]);
        	if (reget.size() >= k) {
        		for (String s : reget) {
        			Integer val = mcount.get(s);
        			mcount.replace(s,  val+1);
        		}
        	}
        }
        
        for (int i=0; i<usize; i++) {
        	answer[i] = mcount.get(id_list[i]);
        }
        return answer;
    }
}