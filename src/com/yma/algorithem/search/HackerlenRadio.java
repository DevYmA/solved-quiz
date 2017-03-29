package com.yma.algorithem.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/14/2017.
 */
public class HackerlenRadio
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        Arrays.sort(x);
        int range = k * 2;
        int counter = 0;
        int sum = 0;
        boolean checker = true;

        sum = x[0];
        while(checker){
            sum += range;
            sum++;
            counter++;
            if(x[n -1] == sum ){
                counter++;
                checker = false;
            }else if(sum-1 == x[n-1]){
                checker = false;
            }else if(x[n -1]-sum < range){
                counter++;
                checker = false;
            }
        }
        System.out.println(counter);

    }
}
