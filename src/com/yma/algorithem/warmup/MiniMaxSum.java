package com.yma.algorithem.warmup;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/10/2017.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        Long max = null;
        Long min = null;
        for(int i = 1; i <= 5 ; i++){
            long total = 0;
            switch (i){
                case (1):
                    total = b + c + d + e;
                    break;
                case (2):
                    total = a + c + d + e;
                    break;
                case (3):
                    total = a + b + d + e;
                    break;
                case (4):
                    total = a + b + c + e;
                    break;
                case (5):
                    total = a + b + c + d;
                    break;
            }
            if (max == null){
                max = total;
            }else if (max < total){
                max = total;
            }
            if (min == null){
                min = total;
            }else if (min > total){
                min = total;
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
