package com.yma.algorithem.warmup;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/10/2017.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i = 0 ; i < n; i++){
            nums[i] = scanner.nextInt();
            if(nums[i] > 0){
                plus++;
            }else if (nums[i] < 0){
                minus++;
            }else{
                zero++;
            }
        }
        System.out.println("++ : "+(float)plus/n);
        System.out.println("-- : "+(float)minus/n);
        System.out.println("00 : "+(float)zero/n);

    }


}
