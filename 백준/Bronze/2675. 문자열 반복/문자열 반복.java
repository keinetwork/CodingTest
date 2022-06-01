import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine()); //  2
        for (int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");  // 3 abc
            int repeat = Integer.parseInt(input[0]);    //  3
            char[] chars = input[1].toCharArray();      // abc
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < repeat; k++) {
                    sb.append(chars[j]);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}