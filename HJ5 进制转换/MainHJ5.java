import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHJ5 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('0', 0X0);
        map.put('1', 0X1);
        map.put('2', 0X2);
        map.put('3', 0X3);
        map.put('4', 0X4);
        map.put('5', 0X5);
        map.put('6', 0X6);
        map.put('7', 0X7);
        map.put('8', 0X8);
        map.put('9', 0X9);
        map.put('A', 0XA);
        map.put('B', 0XB);
        map.put('C', 0XC);
        map.put('D', 0XD);
        map.put('E', 0XE);
        map.put('F', 0XF);
        map.put('a', 0XA);
        map.put('b', 0XB);
        map.put('c', 0XC);
        map.put('d', 0XD);
        map.put('e', 0XE);
        map.put('f', 0XF);

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            int result = 0;
            int shift = 0;
            for (int i = str.length() - 1; i > 1; i--) {
                result += (map.get(str.charAt(i)) << shift);
                shift += 4;
            }
            System.out.println(result);
        }
    }
}
