import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        char[][] format = {
                "c=".toCharArray(),
                "c-".toCharArray(),
                "dz=".toCharArray(),
                "d-".toCharArray(),
                "lj".toCharArray(),
                "nj".toCharArray(),
                "s=".toCharArray(),
                "z=".toCharArray()
        };
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            int remain = str.length - i;
            for (int j = 0; j < format.length; j++) {
                boolean check = true;
                if (remain >= format[j].length) {
                    for (int k = 0; k < format[j].length; k++) {
                        if (check && str[i + k] != format[j][k]) {
                            check = false;
                        }
                    }
                    if (check) {
                        i = i + format[j].length - 1;
                    }
                }
            }
            result++;
        }
        System.out.println(result);
    }
}