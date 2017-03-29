package com.yma.algorithem.string;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/13/2017.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] r = next.split("(?=\\p{Upper})");
        System.out.println(r.length);
        for (String s : r) {
            System.out.println(s);
        }
    }
}
