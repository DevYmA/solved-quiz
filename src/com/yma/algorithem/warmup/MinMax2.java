package com.yma.algorithem.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/14/2017.
 */
public class MinMax2 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            long e = in.nextLong();

            long [] ar = new long []{a, b, c, d, e};
            Arrays.sort(ar);
            int rev = ar.length - 1;
            long max = 0;
            long min = 0;
            for(int i=0;i < ar.length -1; i++){
                max += ar[rev];
                min += ar[i];
                rev--;
            }
            System.out.printf("%s %s",min,max);
        }
    }


