import java.util.Scanner;

public class MainHJ7取近似值 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String resultStr = str;
        if (str.contains(".")) {
            int dotIdx = str.indexOf(".");
            String substring = str.substring(dotIdx + 1);
            if (!substring.isEmpty()) {
                if (Integer.parseInt(String.valueOf(substring.charAt(0))) < 5) {
                    resultStr = str.substring(0, dotIdx);
                } else {
                    resultStr = str.substring(0, dotIdx);
                    int i = Integer.parseInt(String.valueOf(resultStr.charAt(resultStr.length() - 1))) + 1;
                    resultStr = resultStr.substring(0, dotIdx - 1) + i;
                }
            }
        }
        System.out.println(resultStr);
    }
}
