/*************************************************************************
	> File Name: TextFileTest.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月07日 星期日 16时46分45秒
 ************************************************************************/

import me.wlins.util.TextFile;
import java.io.*;
import java.util.*;

public class TextFileTest{
    public static void main(String[] args){
        String file = TextFile.read("TextFile.java");
        TextFile.write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");
        TreeSet<String> words = new TreeSet<String>(new TextFile("TextFile.java"));
        System.out.println(words.headSet("a"));
    }
}

