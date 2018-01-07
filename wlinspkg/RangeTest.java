/*************************************************************************
  > File Name: RangeTest.java
  > Author: Strawberrylin 
  > Github: https://github.com/strawberrylin 
  > Created Time: 2017年11月29日 星期三 23时58分38秒
 ************************************************************************/

import static me.wlins.util.Print.*;
import static me.wlins.util.Range.*;
public class RangeTest{
    public static void main(String[] args){
        int[] result1 = range(10);
        int[] result2 = range(3,10);
        int[] result3 = range(3,10,2);
        for(int i = 0;i < result1.length; i++){
            printnb(result1[i]);
        }
        print();
        for(int i = 0;i < result2.length; i++){
            printnb(result2[i]);
        }
        print();
        for(int i = 0;i < result3.length; i++){
            printnb(result3[i]);
        }
        print();
    }
}

