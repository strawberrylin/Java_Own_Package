---

layout: post
title:  ME.WLINS.UTIL &nbsp; &nbsp; java package document
date: 2018-01-06
tags:
	- 随笔
	- java
    - doc
    - introduction

---

A personal code repository for java, concret introduction as follows:

### Print
+ print(); 输出换行
+ print(obj); 输出然后换行
+ printnb(obj);输出然后不换行
+ printf(format,args);Ｃ语言的printf函数
> usage : import static me.wlins.util.Print.*;

<!--more-->

---
### Range
+ range(n); 产生０～n-1 的数组序列
+ range(start,end);产生start~-end-1的数组序列
+ range(start,end,step);产生start~end-1,间隔为step的数组序列
> usage : import static me.wlins.util.Range.*;
---
### MyStack
+ push(); 进栈
+ pop(); 出栈
+ peek(); 取栈首元素
+ empty();判断是否为空栈
> usage: Stack<T> stack = new Stack<T>(); //T为初始化类型参数

### Hex
将二进制文件转化为十六进制输出
+ format(byte[] data)　静态方法，返回一个十六进制字符串
> usage:\
>  import me.wlins.util.Hex;\
> Hex.format(data);

### Tuple
创建元组，包括二维，三维，四维，五维元组
类：TwoTuple, ThreeTuple, FourTuple, FiveTuple
> usage: 返回多个对象，存在一个元组　\
> return new FourTuple<class1, class2, class3, class4>(new class1(), new class2(), new class3(), new class4());

### PPrint
一个灵巧的打印机，一个可以添加新行并且缩排所有元素的工具
+ String pformat(Collection<?> c); 格式化
+ void pprint(Collection<?> c); 打印
+ void pprint(Object[] c); 打印
> usage:\
> 得到一个重排的字符串：PPrint.pformat(list);
> 打印：PPrint.pprint(list);
> 
### Directory
产生由本地文件构成的对象数组，或者产生由给定目录下的有整个目录树中所有文件构成的List\<File>
+ File[] local(path, regex);+ walk();参数文件起始路径和正则表达式 > usage:\
+ walk();参数文件起始路径和正则表达式 > usage:\


### BinaryFile
打开二进制文件，并返回一个byte[]
+ read(File bfile); 打开二进制文件
+ read(String bfile); 打开二进制文件
> usage:\
> BinaryFile.read("filename");\
> BinaryFile.read(new File(filePath);


### TextFile
读写文件，对文件进行分割
+ read(filename); 读取文件保存到字符串
+ write(aimfile,source); 将源写入目的文件
+ 构造器TextFile(filename, regex);Textfile(filename);有规则就按照规则分割，没有规则默认换行符
> usage;\
> TextFile.read("test.java")'\
> TextFile.write("test1.java", file);\
> TreeSet\<String\> words = new TextFile(filename, "\\W+);

