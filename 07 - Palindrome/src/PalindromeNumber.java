/**
 * A program to check whether a given number is a palindrome.
 *
 * Input: 121
 * Output: true (The number is palindrome)
 * Input: 123
 * Output: false (The number is not palindrome)
 *
 * With time and space complexity
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 15451;

        int originalNum = num;
        int reversedNum = 0;
        int remainder;

        while (num !=0) {
            remainder = num % 10;
            reversedNum = (reversedNum * 10) + remainder;
            num = num / 10;
        }

        if(reversedNum == originalNum) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}

// Time Complexity: O(d), where d is the number of digits in the number.
// Space Complexity: O(1), as only a constant amount of extra space is used.