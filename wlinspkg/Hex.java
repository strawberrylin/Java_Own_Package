/*************************************************************************
	> File Name: Hex.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月04日 星期四 09时34分29秒
    > Description: Convert binary t hex;
 ************************************************************************/

package me.wlins.util;
import java.io.*;

public class Hex{
    public static String format(byte[] data){
        StringBuilder result = new StringBuilder();
        int n = 0;
        for(byte b : data){
            if(n % 16 == 0){
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%02X ", b));
            n ++;
            if(n % 16 == 0){
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }
}

