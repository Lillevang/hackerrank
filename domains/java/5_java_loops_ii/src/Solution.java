import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int curVal = a;
            for (int j = 0; j < n; j++) {
                curVal += b * Math.pow(2, j);
                System.out.print(curVal + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
