import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        var s = "";
        var scanner = new Scanner(System.in);
        var i = scanner.nextInt();
        var d = scanner.nextDouble();
        while(scanner.hasNext()) {
            s = scanner.nextLine();
        }   

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
