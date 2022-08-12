import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while ((n--) > 0) {
            String str = br.readLine();

            if (isP0(str)) {
                sb.append(0).append("\n");
                continue;
            } else if (isP1(str)) {
                sb.append(1).append("\n");
                continue;
            } else sb.append(2).append("\n");
        }
        System.out.println(sb.toString());

    }

    private static boolean isP0(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l <= r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean isP1(String str) {
        int l=0;
        int r = str.length() - 1;

        while (l <= r) {
            if (str.charAt(l) != str.charAt(r)) {
                return isP0(str.substring(l + 1, r + 1)) || isP0(str.substring(l, r));
            }
            l++;
            r--;
        }
        return true;
    }
}