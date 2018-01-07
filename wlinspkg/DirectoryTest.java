/*************************************************************************
	> File Name: DirectoryTest.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月05日 星期五 22时02分23秒
 ************************************************************************/

import me.wlins.util.Directory;

public class DirectoryTest{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println(Directory.walk("."));
        }else{
            for(String arg : args){
                System.out.println(Directory.walk(arg));
            }
        }
    }
}

