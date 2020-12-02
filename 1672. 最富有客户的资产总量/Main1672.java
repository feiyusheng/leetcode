public class Main1672 {
}

class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int maxAmount = 0;
        for (int[] oneAccounts : accounts) {
            int amount = 0;
            for(int account : oneAccounts) {
                amount += account;
            }
            if (amount > maxAmount) {
                maxAmount = amount;
            }
        }
        return maxAmount;
    }
}
