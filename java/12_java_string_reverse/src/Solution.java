public class Solution {

    private static boolean isPalindrome(String s) {
        int i = 0; 
        int j = s.length() - 1;
        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String s = scanner.next();
        var palindrome = isPalindrome(s);
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
