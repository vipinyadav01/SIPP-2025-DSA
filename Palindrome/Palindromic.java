package Palindrome;
//Code of palindromic number
import java.util.Scanner;
public class Palindromic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPalindromic(number)) {
            System.out.println(number + " is a palindromic number.");
        } else {
            System.out.println(number + " is not a palindromic number.");
        }
        scanner.close();
    }

    public static boolean isPalindromic(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}