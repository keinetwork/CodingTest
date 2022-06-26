import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(find(N));
    }

    public static String find(int N) {
        if (N < 1) return "0";
        if (N == 1) return "666";
        String res = "";
        int count = 0;
        for (int index = 0; ; index++) {
            int fCount = findCount(index);
            if (N <= fCount + count) {
                res = Integer.toString(index);
                for (int i = (int) Math.log10(fCount); i < 3; i++) {
                    res += "6";
                }
                if (0 < Math.log10(fCount)) {
                    String format = "%0" + (int) Math.log10(fCount) + "d";
                    res += String.format(format, N - count - 1);
                }
                return res;
            } else {
                count += fCount;
            }
        }
    }

    public static int findCount(int num) {
        int result = 1;
        while (num % 10 == 6) {
            result *= 10;
            num /= 10;
        }
        return result;
    }
}