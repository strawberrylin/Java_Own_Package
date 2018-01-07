/*************************************************************************
	> File Name: TwoTuple.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月05日 星期五 09时48分02秒
    > Description: Creare a two dimension tuple.
 ************************************************************************/

package me.wlins.util;

public class TwoTuple<A, B>{
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){
        first = a;
        second = b;
    } 
    public String toString(){
        return "(" + first + ", "+ second + ")";
    }
}


