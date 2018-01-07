/*************************************************************************
	> File Name: FiveTuple.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月05日 星期五 10时16分05秒
    > Description: Create a Five demension tuple.
 ************************************************************************/

package me.wlins.util;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D>{
    public final E fifth;
    public FiveTuple(A a, B b, C c, D d, E e){
        super(a, b, c, d);
        fifth = e;
    }
    public String toString(){
        return "{" + first + ", " + second + ", " + third + ", " + forth + ", + " +  fifth + "}";
    }
}

