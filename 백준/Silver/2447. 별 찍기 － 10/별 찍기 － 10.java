import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static boolean isBlank(int x, int y, int n) {
        int offset = n / 3; //1,3,9
        if (offset == 0) return false;
        if (x / offset == 1 && y / offset == 1) {
            return true;
        }
        if (x % offset == 1 && y % offset == 1) {
            return true;
        }
        return isBlank(x % offset, y % offset, n / 3);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        char[] star = new char[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (isBlank(i, j, N)) {
                    star[j] = ' ';
                } else {
                    star[j] = '*';
                }
            }
            bw.write(star);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}