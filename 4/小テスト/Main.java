import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ans = random.nextInt(1000);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "��ځF 0�`999�܂ł̐�������͂��Ă��������B");
            int num = sc.nextInt();

            if (ans > num) {
                System.out.println("���͂͐��������������ł��B");
            } else if (ans < num) {
                System.out.println("���͂͐��������傫���ł��B");
            } else {
                System.err.println(i + "��ڂŐ����ł�");
                return;
            }
        }

        System.out.println("������ " + ans + " �ł����BGame Over");
    }
}