import java.util.*;

/**
 * ICPCScoreTotalizerSoftware
 */
public class ICPCScoreTotalizerSoftware {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;

            List<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                list.add(num);
            }

            Collections.sort(list);
            list.remove(0);
            list.remove(list.size() - 1);
            // �ŏ��ƍŌ���J�b�g���ĕ��ϐ؂�̂Ă����傭
            int ans = 0;
            for (int i : list) {
                ans += i;
            }

            System.out.println(ans / list.size());
        }
    }
}