/* 
 * Given an integer, N, print its first 10 multiples.
 * Each multiple N x i where 1 <= i <= 10 should be printend on a new line in the form:
 * N x i = result 
*/

public class Solution {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            var result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
