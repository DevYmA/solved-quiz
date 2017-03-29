package com.yma.week_of_code;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yoshan Amarathunga on 3/14/2017.
 */
public class Gello {
    public static void main(String[] args) {
        long [] a =  new long []{1,2,3,8,5};
        Arrays.sort(a);
        for (long l : a) {
            System.out.println(l);
        }
    }
}
