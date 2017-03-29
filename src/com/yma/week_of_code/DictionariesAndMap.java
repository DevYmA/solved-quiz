package com.yma.week_of_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/15/2017.
 */
public class DictionariesAndMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            Integer val = phoneBook.get(name);
            if(val == null){
                val = phone;
            }
            phoneBook.put(name,val);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phone = phoneBook.get(s);
            if (phone == null){
                System.out.println("Not found");
            }else{
                System.out.println(s+"="+phone);
            }
        }
        in.close();
    }
}
