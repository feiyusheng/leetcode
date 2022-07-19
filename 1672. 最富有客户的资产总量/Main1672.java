import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class Main1672 {
    public static void main(String[] args) throws IOException {

        System.out.printf("553:9943:9034-323".replaceAll("\\:|\\-", ""));

        File file = new File("D:/hh.zip");
        File excel = new File("D:/外司价500条.xlsx");

        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStream out = new FileOutputStream(file);

        ZipOutputStream zipOutputStream = new ZipOutputStream(out);
        try {
            for (int i = 0; i < 5; i++) {
                InputStream inputStream = new FileInputStream(excel);

                ZipEntry z = new ZipEntry(i + "" + ".xlsx");

                zipOutputStream.putNextEntry(z);
                int ch;
                while ((ch = inputStream.read()) != -1) {
                    zipOutputStream.write(ch);
                }
//                zipOutputStream.closeEntry();
            }
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            try {
                zipOutputStream.close();
            } catch (Throwable t1) {
                t1.printStackTrace();
            }
            out.close();
        }

    }
}

class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int maxAmount = 0;
        for (int[] oneAccounts : accounts) {
            int amount = 0;
            for (int account : oneAccounts) {
                amount += account;
            }
            if (amount > maxAmount) {
                maxAmount = amount;
            }
        }
        return maxAmount;
    }
}
