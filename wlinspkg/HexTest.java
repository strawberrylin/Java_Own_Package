/*************************************************************************
	> File Name: HexTest.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月04日 星期四 09时43分55秒
 ************************************************************************/

import me.wlins.util.BinaryFile;
import me.wlins.util.Hex;
import java.io.*;

public class HexTest{
    public static void main(String[] args) throws Exception{
        if(args.length == 0){
            System.out.println(Hex.format(BinaryFile.read("Hex.class")));
        }
        else{
            System.out.println(Hex.format(BinaryFile.read(new File(args[0]))));
        }
    }
}

