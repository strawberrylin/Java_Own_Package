/*************************************************************************
	> File Name: FourTuple.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月05日 星期五 10时10分04秒
    > Description: Creatr a four demension tuple.
 ************************************************************************/

package me.wlins.util;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C>{
    public final  D forth;
    public FourTuple(A a, B b, C c, D d){
        super(a, b, c);
        forth = d;
    }
    public String toString(){
        return "{" + first + ", " + second + ", " + third +", " + forth +"}";
    }
}

