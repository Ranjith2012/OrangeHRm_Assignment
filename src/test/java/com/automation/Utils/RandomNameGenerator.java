package com.automation.Utils;

import java.util.Random;

public class RandomNameGenerator {

    static String Characters = "abcdefghijklmnopqrstuvwxyz1234567890";

    public static String generateNameRandomly(int len){
        StringBuilder sb = new StringBuilder(len);
        Random random = new Random();

        for(int i=0;i<len;i++){
            int ch = random.nextInt(Characters.length());
            sb.append(Characters.charAt(ch));
        }
        return sb.toString();
    }


}
