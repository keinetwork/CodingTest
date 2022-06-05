import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputs = br.readLine().split(" ");

        int flag = 0;

        for (int i = inputs[0].length() - 1, j = inputs[1].length() - 1; i >= 0 || j >= 0; i--, j--) {
            int num = flag;

            if (i >= 0) num += inputs[0].charAt(i) - '0';

            if (j >= 0) num += inputs[1].charAt(j) - '0';


            if (num < 10) flag = 0;
            else {
                flag = 1;
                num -= 10;
            }

            sb.append(num);
        }

        if (flag == 1) sb.append(1);

        System.out.println(sb.reverse());
    }
}
