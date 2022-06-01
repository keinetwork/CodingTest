import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        char[] upStr = str.toUpperCase().toCharArray();
        Map<Character,Integer> data = new HashMap();
        for(int i=0; i<upStr.length; i++) {
            Integer val = data.get(upStr[i]);
            if(val == null) {
                data.put(upStr[i], 1);
            } else
            {
                data.put(upStr[i], val+1);
            }
        }
        int[] rankVal = {0};
        char[] rankId = {'?'};
        data.forEach((id, val)->{
            if(val > rankVal[0]) {
                rankVal[0] = val.intValue();
                rankId[0] = id.charValue();
            }
        });
        data.forEach((id, val)->{
            if(val.equals(rankVal[0]) && !id.equals(rankId[0]) ) {
                rankId[0] = '?';
            }
        });

        System.out.print(rankId[0]);
    }
}

