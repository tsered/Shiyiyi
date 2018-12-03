# 月份天数

## Problem Description

根据历法，凡是1、3、5、7、8、10、12月每月31天，凡是4、6、9、11月每月30天，2月份闰年29天，平年28天。闰年的判断方法是：如果此年号能被400整除，则是闰年；否则如果此年号能被4整除，而不能被100整除，则是闰年；其余都不是闰年。
请根据输入的年份月份信息，计算该月的天数。

## Input

有一些数据组，每组数据含有两个正整数，表示年份和月份，如果年份和月份都是0，表示输入结束。

## Output

根据输入数据，在一行中输出月份天数，如果月份值非法，则输出ERROR。

## Sample Input

```
2008  1
2006  12
2009  11
1997  22
1887  2
1977  1
0  0
```

## Sample Output

```
31
31
30
ERROR
28
31
```

## References

[月份天数](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1890)