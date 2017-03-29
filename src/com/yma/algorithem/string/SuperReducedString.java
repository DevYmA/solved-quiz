package com.yma.algorithem.string;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/12/2017.
 */
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        boolean terminate = true;
        while (terminate){
            StringBuilder sb = new StringBuilder(s);
            Character ch = null;
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if(ch == null){
                    ch = c;
                }else{
                    if(ch.equals(c)){
                        sb.delete((i-1),(i+1));
                        s = sb.toString();
                        break;
                    }else{
                        ch = c;
                    }
                }
            }
            if(s.isEmpty()){
                s = "Empty String";
                terminate = false;
            }else {
                boolean isExit = false;
                for (int i = 0; i < s.length(); i++) {
                    Character c = s.charAt(i);
                    if(ch == null){
                        ch = c;
                    }else{
                        if(ch.equals(c)){
                            isExit = true;
                            break;
                        }else{
                            ch = c;
                        }
                    }
                }
                terminate = isExit;
            }
        }
        System.out.println(s);
    }
}
