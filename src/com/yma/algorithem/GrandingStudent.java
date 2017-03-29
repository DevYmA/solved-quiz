package com.yma.algorithem;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/11/2017.
 */
public class GrandingStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            System.out.println(roundingGrade(grade));
        }
    }

    public static String roundingGrade(int grade){
        if(grade <= 100 ){
           if(grade >= 38){

               int difference = 5 - (grade % 5);
               if(difference < 3 ){
                    grade += difference;
               }
           }
           return String.valueOf(grade);
        }
        return "Your enterd grade isn't valid";
    }
}
