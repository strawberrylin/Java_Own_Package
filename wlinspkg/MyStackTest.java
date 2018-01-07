/*************************************************************************
	> File Name: StackTest.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月03日 星期三 20时18分06秒
 ************************************************************************/
import static  me.wlins.util.Print.*;
import me.wlins.util.MyStack;

public class MyStackTest{
    public static void main(String[] args){
        MyStack<String> stack = new MyStack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            print(stack.pop());
        }
    }
}

