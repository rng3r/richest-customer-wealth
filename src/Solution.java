import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(row -> Arrays.stream(row).sum())
                .max()
                .getAsInt();
    }
}
