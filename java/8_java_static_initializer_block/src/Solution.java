import java.util.Scanner;

public class Solution {
    
    private static Scanner scanner = new Scanner(System.in);
    private static int B = scanner.nextInt();
    private static int H = scanner.nextInt();
    private static boolean flag = (B > 0 && H > 0);

    public static void main(String[] args) {
        try {
            if (flag) {
                int area = B * H;
                System.out.println(area);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e + ": Breadth and height must be positive");
        }
    }
}
