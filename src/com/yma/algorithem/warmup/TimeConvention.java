package com.yma.algorithem.warmup;

import java.util.Scanner;

/**
 * Created by Yoshan Amarathunga on 3/11/2017.
 */
public class TimeConvention {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        String meridiem = time.substring(time.length() - 2);
        String only_time = time.substring(0, (time.length() - 2));
        String [] split_time = only_time.split(":");
        int hour = Integer.parseInt(split_time[0]);

        if(meridiem.equals("PM")){
            if(hour != 12){
                hour += 12;
            }
        }else{
            if(hour == 12){
                hour = 0;
            }
        }
        String formatedHour = String.format("%02d", hour);
        System.out.print(formatedHour+":"+split_time[1]+":"+split_time[2]);
    }
}
