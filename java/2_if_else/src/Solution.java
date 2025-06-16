
/* Task
 * Given an integer, n, perform the following conditional actions:
 * If n is odd, print "Weird"
 * If n is even and in the inclusive range of 2 to 5, print "Not Weird"
 * If n is even and in the inclusive range of 6 to 20, print "Weird" 
 * If n is even and greater than 20, print "Not Weird"
*/

public class Solution {

    private static final String WEIRD = "Weird";
    private static final String NOTWEIRD = "Not Weird";

    private static void printIfWeird(int n) {
        if (!isEven(n)) {
            System.out.println(WEIRD);
        } else if (isEven(n) && n >= 2 && n <= 5) {
            System.out.print(NOTWEIRD);
        } else if (isEven(n) && n >= 6 && n <= 20) {
            System.out.println(WEIRD);
        } else if (isEven(n) && n > 20) {
            System.out.println(NOTWEIRD);
        }
    }
    
    private static boolean isEven(int n) {
        return n % 2 == 0;
    }   
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            var n = scanner.nextInt();
            printIfWeird(n);
        }
    }
}
