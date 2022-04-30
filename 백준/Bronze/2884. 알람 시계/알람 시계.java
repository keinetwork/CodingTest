import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int H = scanner.nextInt();
      int M = scanner.nextInt();
      int alram = H*60+M-45;
      if (alram <0) alram = 1440+alram;
      System.out.println(alram/60+" "+alram%60);
    }
}