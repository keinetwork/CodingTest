import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] bongi = {0, 0};
        int c = 0;
        while (true) {
            bongi[0] = N / 5;
            bongi[0] -= c;
            int calc = N - (bongi[0] * 5);
            bongi[1] = calc / 3;
            if (bongi[0] * 5 + bongi[1] * 3 == N) {
                break;
            } else {
                if (bongi[0] == 0) {
                    bongi[1] = -1;
                    break;
                }
            }
            c++;
        }
        System.out.println(bongi[0] + bongi[1]);

    }
}