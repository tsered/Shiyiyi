# 统计因子数

## Description

一个整数可能被2,3,5,7,11,13,17,19整除。对于一批整数，希望统计一下，能整除其中1个的有多少个，能整除其中2个的有多少个，…，最后，能整除全部上述素数的有多少个，不能整除任何一个素数的又有几个也要统计出来。请你帮忙做这个事吧。

## Input

若干个整数N`(0<N<10^7)`。当N为0时，输入结束。

## output

对于全部整数，首先输出整数的个数，占一行。然后，按整除8个（全部整除），有多少个，整除7个有多少个，等等的顺序，按样本输出的格式，即一个数字一个冒号，再是一个个数的格式，每个整除情况占一行，输出统计结果。

## Sample Input

```
100 12 34 19 79 21 20 0
```

## Sample Output

```
7
8:0
7:0
6:0
5:0
4:0
3:0
2:5
1:1
0:1
```

## References

[统计因子数](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1594)

