import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private final static Pattern p = Pattern.compile("\\pZ*\\s*|\t|\r|\n");

    public static void main(String[] args) {
//        String token = MD5Util1.sha("!W120Z!q");
//        System.out.println(token);
        String dest = "222 240 7117";
        System.out.println("222 240 7117");
        Matcher m = p.matcher("222 240 7117");
        System.out.println(m.replaceAll(" "));

        System.out.println(dest.replaceAll("[\\pZ]", " "));
    }
}
