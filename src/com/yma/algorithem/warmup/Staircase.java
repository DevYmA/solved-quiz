package com.yma.algorithem.warmup;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/10/2017.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n -i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
