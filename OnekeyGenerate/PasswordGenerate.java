public class PasswordGenerate {
    public static void main(String[] args) throws Exception {
//        String priKey = "MIIBUwIBADANBgkqhkiG9w0BAQEFAASCAT0wggE5AgEAAkEAyA7zLr/8/ele+yaZuRprrTiPOdOBO9IViT1XX4I3BdlcJkPf+vI+MJgvB+kjn76F1eYIj2ra7dhb5DOW+M5U+QIDAQABAkA3RHIIEz/YAXWc2nATQ+pFQ1/F8Nk95m7OqCSQHRAITCMFguUPjkQHjctyk8mMjJHLpKBJm9QOTGqzw0ZdO9IBAiEA/2VnP9aUKokHzk/SfN6nlzArxQtuNIS93TIE/LVd+TkCIQDIiAytrnrXxnnWy3iCv+2uhUj6JCHJJm2NPkdm4vX5wQIgBl0fen69SGYLtL9WblgZ8vF3VbyYLWTVWkqhxy45vjkCIHoHWHfEipqN/Ay6yv3935xpHWyi2jB3AwmFkZvJl1fBAiAgOmZUpcj0/L6hoGMbqc0ZWeDyBfj8MgfRzsro9912+w==";
//        List<String> strings = Arrays.asList("erp-20001-reader", "erp-20002-reader", "erp-20003-reader", "erp-20004-reader", "erp-20005-reader", "erp-20006-reader", "erp-20007-reader", "erp-20008-reader");
//        for (String string : strings) {
//            System.out.println("account:"+string);
//            String randomString = getRandomString(9);
//            System.out.println("pwd:"+randomString);
//            System.out.println("enPwd:" + ConfigTools.encrypt(priKey, randomString));
//        }
        String key = "sNrcNO9b";
        String token = MD5Util.sha(key);
        System.out.println(token);
    }
}
