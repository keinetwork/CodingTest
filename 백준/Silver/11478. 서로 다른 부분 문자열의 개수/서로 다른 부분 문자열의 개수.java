import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int count = 0;
        int len = S.length();
        Set<String> k = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String s = S.substring(i, j);
                k.add(s);
            }
        }
        System.out.println(k.size());
    }

}