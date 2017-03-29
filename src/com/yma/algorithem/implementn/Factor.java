package com.yma.algorithem.implementn;

/**
 * Created by Yoshan Amarathunga on 3/13/2017.
 */
public class Factor {
    public static void main(String[] args){
        int n = 96;

        for(int i=2; i<=n; i++){
            while(n%i==0){
                System.out.println(i + "| " + n);
                System.out.println(" -----");
                n = n/i;
            }
        }
    }
}
