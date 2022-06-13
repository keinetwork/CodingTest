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
        char[][] star = new char[N][N];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % 3 == 1 && j % 3 == 1) {
                    star[i][j] = ' ';
                } else {
                    star[i][j] = '*';
                }
            }
        }
        int[] ep = {3, 6};
        int[] cp = {3, 9};
        while (cp[1] <= N) {
            for (int i = 0; i < cp[1]; i++) {
                for (int j = 0; j < cp[1]; j++) {
                    if (star[i][j] != 0) continue;
                    if (i >= ep[0] && i < ep[1] && j >= ep[0] && j < ep[1]) {
                        star[i][j] = ' ';
                        continue;
                    }
                    star[i][j] = star[i % cp[0]][j % cp[0]];
                }
            }
            ep[0] *= 3;
            ep[1] = ep[0] * 2;
            cp[0] *= 3;
            cp[1] *= 3;
        }
        for (int i = 0; i < cp[0]; i++) {
            bw.write(star[i]);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}