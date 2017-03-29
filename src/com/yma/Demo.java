package com.yma;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/12/2017.
 */
public class Demo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String start = "min(";
        int count = 0;
        String out = "";
        for(int i =0;i < n - 1;i++){
            count++;

            out += start +"int, ";

        }

        String end = "int";
        for (int i = 0; i < count; i++) {
            end +=")";
        }
        out += end;
        System.out.println(out);
    }
}
