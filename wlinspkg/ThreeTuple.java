/*************************************************************************
	> File Name: ThreeTuple.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月05日 星期五 10时00分08秒
    > Description: Create a three demension tuple.
 ************************************************************************/

package me.wlins.util;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
    public final C third;
    public ThreeTuple(A a, B b, C c){
       super(a, b);
       third = c;
    }
    public String toString(){
        return "{" + first + ", " + second + ", " + third +"}";
    }
}

