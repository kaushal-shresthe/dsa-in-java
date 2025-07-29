package linearsearch;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i<accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                 sum = sum +  accounts[i][j];
            }
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,5}, {3,2,1}, {2,5,7}};
        Solution s = new Solution();
        int result = s.maximumWealth(accounts);
        System.out.println(result);
    }

}
