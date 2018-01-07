/*************************************************************************
	> File Name: PPrint.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月05日 星期五 20时39分19秒
    > Description: a tool to print all the elements.
 ************************************************************************/

package me.wlins.util;
import java.util.*;

public class PPrint{
    public static String pformat(Collection<?> c){
        if(c.size() == 0) return "[]";
        StringBuilder result = new StringBuilder("[]");
        for(Object elem : c){
            if(c.size() != 1) result.append("\n ");
            result.append(elem);
        }
        if(c.size() != 1) result.append("\n ");
        result.append("]");
        return result.toString();
    }
    public static void pprint(Collection<?> c){
        System.out.println(pformat(c));
    }
    public static void pprint(Object[] c){
        System.out.println(pformat(Arrays.asList(c)));
    }
}

