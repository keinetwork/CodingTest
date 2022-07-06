import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (mapX.containsKey(x)) {
                mapX.put(x, 2);
            } else {
                mapX.put(x, 1);
            }
            if (mapY.containsKey(y)) {
                mapY.put(y, 2);
            } else {
                mapY.put(y, 1);
            }
        }
        int x = 0, y = 0;
        for (Integer o : mapX.keySet()) {
            if (mapX.get(o) == 1) {
                x = o;
                break;
            }
        }
        for (Integer o : mapY.keySet()) {
            if (mapY.get(o) == 1) {
                y = o;
                break;
            }
        }
        System.out.println(x + " " + y);
    }
}