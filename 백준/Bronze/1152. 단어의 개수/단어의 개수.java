import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] c = {0,0};
        int index =0;
        int result = 0;
        c[index] = System.in.read();;
        while (true) {
            index = (index+1) % 2;
            c[index] = System.in.read();
            if(c[index] < 32) break;
            if(c[index] == 32) {
                result++;
            }
        }
        if (c[++index%2] != 32) {
            result++;
        }
        System.out.print(result);
    }
}