public class PasswordGenerate {
    public static void main(String[] args) throws Exception {

        String privateKey = "";

        String pubKey = "";

        String key = "6vxeL^1@$3Bf93TJ";
        String encryptKey = ConfigTools.encrypt(privateKey, key);
        System.out.println(encryptKey);
        System.out.println(ConfigTools.decrypt(pubKey, encryptKey));

        System.out.println(pubKey.length());
    }
}
