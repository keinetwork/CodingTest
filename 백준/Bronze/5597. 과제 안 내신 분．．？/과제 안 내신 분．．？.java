import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] report = new boolean[31];
        for (int i = 0; i <28 ; i++) {
            report[Integer.parseInt(br.readLine())]=true;
        }
        for (int i = 1; i < 31; i++) {
            if(!report[i]){
                System.out.println(i);
            }
        }
    }
}