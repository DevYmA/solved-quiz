package com.yma.algorithem.implementn;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/13/2017.
 */
public class AppleAndOrrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();//house's starting
        int t = in.nextInt();//house's ending
        int a = in.nextInt();//apple tree
        int b = in.nextInt();//orange tree
        int m = in.nextInt();//count of apple
        int n = in.nextInt();//count of orange
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int roof_m = 0;
        int roof_n = 0;
        for (int i : apple) {
            int fell_point = a + i;
            if( s <= fell_point && t >= fell_point){
                roof_m++;
            }
        }

        for (int i : orange) {
            int feel_point = b + i;
            if(t >= feel_point && s <= feel_point){
                roof_n++;
            }
        }
        System.out.println("Count of Aplles fell down on the roof : "+roof_m);
        System.out.println("Count of Oranges fell down on the roof : "+roof_n);
    }
}
