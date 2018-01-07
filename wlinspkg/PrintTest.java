/*************************************************************************
	> File Name: PrintTest.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2017年11月29日 星期三 17时33分58秒
 ************************************************************************/
import static me.wlins.util.Print.*;
public class PrintTest{
    public static void main(String[] args) {
        print("Available from now on!");
        print(100);
        print(100L);
        print();
        printf("%d,%d\n",1,2);
        print(3.14195);
    }
}

