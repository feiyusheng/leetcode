import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHJ8合并表记录 {
    public static void main(String[] args) {
        Long[] arr = new Long[11111112];
        Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.nextLine());
        for (int i = 0; i < len; i++) {
            String[] strArr = in.nextLine().split(" ");

            int key = Integer.parseInt(strArr[0]);
            int value = Integer.parseInt(strArr[1]);
            arr[key] =  (arr[key] == null ? 0 : arr[key]) + Long.parseLong(strArr[1]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}
