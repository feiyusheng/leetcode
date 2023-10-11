import java.util.Scanner;

public class MainHJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = 0;
        int[] arr = new int[501];
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            len = in.nextInt();
            break;
        }
        for (int i = 0; i < len; i++) {
            arr[in.nextInt()] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println(i);
            }
        }

    }
}

