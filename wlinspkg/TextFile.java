/*************************************************************************
  > File Name: TextFile.java
  > Author: Strawberrylin 
  > Github: https://github.com/strawberrylin 
  > Created Time: 2018年01月07日 星期日 04时06分34秒
  > Description: Write and read the file as the single string and treat the file as ArrayList.
 ************************************************************************/

package me.wlins.util;
import java.util.*;
import java.io.*;

public class TextFile extends ArrayList<String>{
    public static String read(String fileName){
        StringBuilder  sb = new StringBuilder();
        try{
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
            try{
                String s;
                while((s = in.readLine()) != null){
                    sb.append(s + "\n");
                }
            }finally {
                in.close();
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    public static void write(String fileName, String text){
        try{
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            }finally{
                out.close();
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    //Read a file, split by any regular expression
    public TextFile(String fileName, String splitter){
        super(Arrays.asList(read(fileName).split(splitter)));
        if(get(0).equals("")) remove(0);
    }
    public TextFile(String fileName){
        this(fileName,"\n");
    }
    public void write(String fileName){
        try{
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try{
                for(String item : this){
                    out.println(item);
                }
            }finally{
                out.close();
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}


