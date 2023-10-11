import java.util.Scanner;

public class MainHJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder(str);
            while (sb.length() > 0) {
                while (sb.length() < 8) {
                    sb.append("0");
                }
                String substring = sb.substring(0, 8);
                System.out.println(substring);
                if (sb.length() > 8) {
                    sb = new StringBuilder(sb.substring(8));
                } else {
                    break;
                }
            }
        }
    }
}
