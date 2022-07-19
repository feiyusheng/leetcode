import java.math.BigDecimal;

public class Password {
    public static void main(String[] args) {
        String token = MD5Util.sha("DayOne20190930");
        System.out.println(token);

        BigDecimal price = new BigDecimal("58.3");
        System.out.println(price.toString());
    }
}
