import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int H = scanner.nextInt();
      int M = scanner.nextInt();
      int cook = scanner.nextInt();
      int end = H*60+M+cook;
      end = end%1440;
      if (end < 0) end = 1440+end;
      System.out.println(end/60+" "+end%60);
    }
}