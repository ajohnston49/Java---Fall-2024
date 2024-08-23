//Credit Card Authorizer Tool
//developer: Alex Johnston
//Version 1.0 - 8/23/2024

import java.util.Scanner;

public class CreditCardAuthorizer {

    public static final int PREFIX_VISA = 4;
    public static final int PREFIX_MASTER = 5;
    public static final int PREFIX_AMERICAN_XP = 37;
    public static final int PREFIX_DISCOVERS = 6;

    static int[] prefixes = new int[] {
            PREFIX_VISA, PREFIX_MASTER, PREFIX_AMERICAN_XP, PREFIX_DISCOVERS
    };

    public static void main(String[] args) {


        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a credit card number: ");
            long creditCardNum = input.nextLong();

            if (isValid(creditCardNum)) {
                System.out.println(creditCardNum + " is valid.");
            } else {
                System.out.println(creditCardNum + " is INVALID");
            }
        }
    }

       public static boolean isValid(long number) {

        if (getSize(number) > 16 || getSize(number) < 13) return false;

        for (int i = 0; i < prefixes.length; i++) {

            if (getPrefix(number, prefixes[i]) == prefixes[i]) break; // prefix match
            if (i < prefixes.length - 1) return false; // no prefix return false

        }

        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return sum % 10 == 0;
    }

    public static boolean prefixMatched(long number, int d) {

        if (d > number) return false;

        long difference = (getSize(number) - getSize(d));

        return d == (int)(number / Math.pow(10, difference));

    }

    public static long getPrefix(long number, int k) {
        if (prefixMatched(number, k)) return k;

        return number;
    }

    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;
        while (number > 0) {
            number /= 10;
            int digit = getDigit((int) (number % 10) * 2);
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int sumOfOddPlace(long number) {

        int sum = 0;
        while (number > 0) {

            int digit = (int) (number % 10);
            digit = getDigit(digit);
            sum += digit;
            number /= 100;
        }
        return sum;
    }

    public static int getDigit(int number) {

        return (number > 9) ? number - 9 : number;
    }

        public static int getSize(long d) {

        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }
        return size;
    }
}