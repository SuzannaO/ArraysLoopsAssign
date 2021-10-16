import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        int number = new Scanner(System.in).nextInt();

        if (isPalindrome(number)) {
            System.out.println("Number: " + number + " is a palindrome");
        } else {
            System.out.println("Number: " + number + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
}


