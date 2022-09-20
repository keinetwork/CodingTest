import java.sql.Time;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String,String> recordMap = new TreeMap<>();
        Map<String,Long> answerMap = new TreeMap<>();
        for(String record : records) {
            String[] str = record.split(" ");

            if(str[2].equals("OUT")){
                String val = recordMap.get(str[1]);
                long stTime = Time.valueOf("00:"+str[0]).getTime()-Time.valueOf(val).getTime();
                stTime /= 1000;
                if(answerMap.containsKey(str[1])){
                    answerMap.put(str[1], answerMap.get(str[1])+stTime);
                } else {
                    answerMap.put(str[1], stTime);
                }
                recordMap.remove(str[1]);
            }else {
                if(str[0].equals("23:59")) continue;
                recordMap.put(str[1], "00:"+str[0]);
            }

        }
        for(String key : recordMap.keySet()) {
            String startTime = recordMap.get(key);
            long stTime = Time.valueOf("00:23:59").getTime()-Time.valueOf(startTime).getTime();
            stTime /= 1000;
            if(answerMap.containsKey(key)){
                answerMap.put(key, answerMap.get(key)+stTime);
            } else {
                answerMap.put(key, stTime);
            }
        }

        int[] answer = new int[answerMap.size()];
        int idx = 0;
        for (String key: answerMap.keySet()) {
            answer[idx] = fees[1];
            long stTime = answerMap.get(key);
            if(stTime > fees[0]){
                stTime -= fees[0]-fees[2]+1;
                answer[idx] += (stTime / fees[2])*fees[3];
            }
            idx++;
        }
        return answer;
    }


}