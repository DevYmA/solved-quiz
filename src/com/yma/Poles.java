package com.yma;

import java.util.*;

/**
 * Created by Yoshan Amarathunga on 3/16/2017.
 */
public class Poles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Map map = new HashMap<Integer, Integer>();
        for(int a0 = 0; a0 < n; a0++){
            int x_i = in.nextInt();
            int w_i = in.nextInt();
            map.put(x_i,w_i);
        }

        Map <Integer, Integer>map2 = new TreeMap<Integer,Integer>(map);
        int point = n / k;


        int count = 0;
        int minAlt = 0;
        for (Map.Entry<Integer,Integer> e :map2.entrySet()) {
            if(count != 0){
                Integer key = e.getKey();
                Integer value = e.getValue();
                for (int i = 1; i < k; i++) {

                }
            }else{
                minAlt = e.getKey();
            }
            count++;
        }

    }
}
