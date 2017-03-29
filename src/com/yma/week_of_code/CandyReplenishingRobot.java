package com.yma.week_of_code;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/13/2017.
 */
public class CandyReplenishingRobot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        int bowl = n;
        int inc = 0;
        for (int i = 0; i < t; i++) {
            bowl = bowl - c[i];
            if(i != (t-1)){
                if(bowl < 5){
                    int incres = (n - bowl);
                    inc += incres;
                    bowl += incres;
                }
            }
        }
        System.out.println(inc);
    }
}
