import java.util.*;
import java.lang.*;

/**
 * SevenPuzzle
 */
public class SevenPuzzle {

    public static void main(String[] args) {
        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };
        int cost = 1;

        Queue<String> queue = new ArrayDeque<>(); // �L���[�i��Ԃ�����j
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); // �n�b�V���}�b�v�i��ԂƉ���0�𓮂�������Ή��j

        // ���D��T��
        queue.add("01234567");
        hashmap.put("01234567", 0);

        while (!queue.isEmpty()) {
            int mawarukaisuu = queue.size();
            for (int j = 0; j < mawarukaisuu; j++) {
                String str = queue.poll(); // �L���[���o��
                int zeroX = str.indexOf("0") % 4;
                int zeroY = str.indexOf("0") / 4;

                for (int i = 0; i < 4; i++) {
                    int newX = zeroX + dx[i];
                    int newY = zeroY + dy[i];

                    if (newX < 0 || newX > 3 || newY < 0 || newY > 1) {
                        continue;
                    }

                    String newStr;
                    if (str.indexOf("0") < newX + newY * 4) {
                        newStr = str.substring(0, str.indexOf("0")) + str.charAt(newX + newY * 4)
                                + str.substring(str.indexOf("0") + 1, newX + newY * 4) + "0"
                                + str.substring(newX + newY * 4 + 1);
                    } else {
                        newStr = str.substring(0, newX + newY * 4) + "0"
                                + str.substring(newX + newY * 4 + 1, str.indexOf("0")) + str.charAt(newX + newY * 4)
                                + str.substring(str.indexOf("0") + 1);
                    }

                    if (hashmap.get(newStr) == null) {
                        // �n�b�V���}�b�v�Ɋi�[(���Ƃ��Ƃ������璎)
                        hashmap.put(newStr, cost);

                        // ����������̕����L���[�ɒǉ�
                        queue.add(newStr);
                    }

                }
            }
            cost++;
        }

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = "";

            for (int i = 0; i < 8; i++) {
                str = str + sc.next();
            }

            System.out.println(hashmap.get(str)); // �n�b�V���}�b�v�ɕύX����
        }

        sc.close();
    }
}