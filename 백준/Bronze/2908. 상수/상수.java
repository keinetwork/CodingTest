import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = sb.append(br.readLine()).reverse().toString();
        int[] num = Arrays.stream(str.split(" "))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        System.out.print(num[0] > num[1] ? num[0] : num[1]);
    }
}