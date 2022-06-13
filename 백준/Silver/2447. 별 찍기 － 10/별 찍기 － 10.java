import java.io.*;

class Main {
    public static char[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        star = new char[n][n];

        printStar(0, 0, n, true);
        for (int i = 0; i < n; i++) {
            bw.write(star[i]);
            bw.write("\n");
        }
        bw.flush();
    }

    private static void printStar(int x, int y, int n, boolean isStar) {
        if (!isStar) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    star[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            star[x][y] = '*';
            return;
        }
        int cnt = 0;
        for (int i = x; i < x + n; i += n / 3) {
            for (int j = y; j < y + n; j += n / 3) {
                printStar(i, j, n / 3, cnt != 4);
                cnt++;
            }
        }
    }
}