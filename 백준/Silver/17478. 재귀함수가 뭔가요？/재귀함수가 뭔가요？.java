import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static String[] str = {"어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n",
            "\"재귀함수가 뭔가요?\"\n",
            "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n",
            "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n",
            "라고 답변하였지.\n"
    };

    public static void chatbot(int a, int b, StringBuilder sb) {
        String prefix = "";
        for (int i = 0; i < a; i++) {
            prefix += "____";
        }
        if (a == 0) {
            sb.append(str[0]);
        }
        if (a < b) {
            sb.append(prefix).append(str[1]);
            sb.append(prefix).append(str[2]);
            sb.append(prefix).append(str[3]);
            sb.append(prefix).append(str[4]);
            chatbot(a + 1, b, sb);
        }

        if (a == b && a > 0) {  // 마지막
            sb.append(prefix).append(str[1]);
            sb.append(prefix).append(str[5]);
        }
        sb.append(prefix).append(str[6]);        //답변
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        chatbot(0, N, sb);
        System.out.println(sb.toString());
    }
}