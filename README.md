# Shiyiyi

这是一个编程练习项目，想可以跟小谢通过这个项目学习各种计算机语言，先从 `Java` 入手。

# Java

本地环境：

```
$ java -version
java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)
```

运行：

```
$ cd 20181104
$ javac Main.java
$ java Main < input.txt | diff output.txt -
```
# C/C++

本地环境：

```
$ gcc -v
gcc version 7.3.0 (Ubuntu 7.3.0-27ubuntu1~18.04) 
$ g++ -v
gcc version 7.3.0 (Ubuntu 7.3.0-27ubuntu1~18.04)
```

运行C：

```
$ cd 20181104
$ gcc main.c
$ ./a.out < input.txt | diff output.txt -
```

运行C++：

```
$ g++ main.cpp
$ ./a.out < input.txt | diff output.txt -
```

