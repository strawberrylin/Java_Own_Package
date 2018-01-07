/*************************************************************************
	> File Name: Range.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2017年11月29日 星期三 23时43分45秒
    > Package: me.wlins.util
    > Description: Array creation methods that can be used without qualifiers useing java SE5 static imports
 ************************************************************************/
package me.wlins.util;

public class Range{
    // Produce a sequence [0..n]
    public static int[] range(int n){
        int[] result = new int[n];
        for(int i = 0;i < n; i ++){
            result[i] = i;
        }
        return result;
    }
    // Produce a sequece [start...end]
    public static int[] range(int start,int end){
        int sz = end - start;
        int[] result = new int[sz];
        for(int i = 0;i < sz; i ++){
            result[i] = start + i;
        }
        return result;
    }
    // Produce a sequence [start...end] step by step
    public static int[] range(int start,int end,int step){
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for(int i = 0;i < sz; i ++){
            result[i] = start + i * step;
        }
        return result;
    }
}

