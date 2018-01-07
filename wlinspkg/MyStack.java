/*************************************************************************
	> File Name: Stack.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月03日 星期三 19时37分36秒
    > Description: Making a stack from LinkedList
 ************************************************************************/

package me.wlins.util;
import java.util.LinkedList;

public class MyStack<T>{
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v){
        storage.add(v);
    }
    public T peek(){
        return storage.getFirst();
    }
    public T pop(){
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }
    public String toString(){
        return storage.toString();
    }
}

