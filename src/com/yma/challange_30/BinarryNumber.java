package com.yma.challange_30;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/28/2017.
 */
public class BinarryNumber {
    static String no = "";

    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        number=in.nextInt();

        if (number <0)
            System.out.println("Not a positive integer");
        else {
            binaryform(number);
            System.out.println(no);
            String bitStr = no;

            int maxLength = Arrays.stream(bitStr.split("0+"))
                    .mapToInt(String::length)
                    .reduce(0, Math::max);
            System.out.println( maxLength);

        }
    }

    private static Object binaryform(int number) {
        int remainder;

        if (number <=1) {
            no += number;
            return null;   // KICK OUT OF THE RECURSION
        }

        remainder= number %2;
        binaryform(number >> 1);
        no += remainder;
        {
            return " ";
        }
    }

}
