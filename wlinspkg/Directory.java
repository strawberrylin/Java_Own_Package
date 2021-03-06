/*************************************************************************
	> File Name: Directory.java
	> Author: Strawberrylin 
	> Github: https://github.com/strawberrylin 
	> Created Time: 2018年01月05日 星期五 20时01分49秒
    > Description: Create the File Array or File List.
 ************************************************************************/

package me.wlins.util;
import java.io.*;
import java.util.regex.*;
import java.util.*;

public final class Directory{
    public static File[] local(File dir, final String regex){
        return dir.listFiles(new FilenameFilter(){
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name){
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[] local(String path, final String regex){
        return local(new File(path), regex);
    }

    // a two-tuple for returning a pair of objects
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();
        //The default iterable element is the file list
        public Iterator<File> iterator(){
            return files.iterator();
        }
        void addAll(TreeInfo other){
            files.addAll(other.files);
            dirs.addAll(other.files);
        }
        public String toString(){
            return "dirs: " + PPrint.pformat(dirs) +
                    "\n\nfiles: " + PPrint.pformat(files);
        }
    }

    public static TreeInfo walk(String start, String regex){
        return recurseDirs(new File(start), regex);
    }
    public static TreeInfo walk(File start, String regex){
        return recurseDirs(start, regex);
    }
    public static TreeInfo walk(File start){
        return recurseDirs(start, ".*");
    }
    public static TreeInfo walk(String start){
        return recurseDirs(new File(start), ".*");
    }
    static TreeInfo recurseDirs(File startDir, String regex){
        TreeInfo result = new TreeInfo();
        for(File item : startDir.listFiles()){
            if(item.isDirectory()){
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            }else{
                if(item.getName().matches(regex)){
                    result.files.add(item);
                }
            }
        }
        return result;
    }
}

