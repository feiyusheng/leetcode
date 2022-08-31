public class PasswordGenerate {
    public static void main(String[] args) throws Exception {


        String key = "nw2Y#%mCrb2!rtVv";
        String encryptKey = ConfigTools.encrypt(privateKey, key);
        System.out.println(encryptKey);
        System.out.println(ConfigTools.decrypt(pubKey, encryptKey));

    }
}
