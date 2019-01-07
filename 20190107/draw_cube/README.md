# 方块设计

## Description

对于 `N=5`，`M=3` 的输入来说，“方块设计”就表示下图所示的图形：

```
+-----------+   +-------+
I-X-X-X-X-X-I   I-X-X-X-I
I-X-X-X-X-X-I   I-X-X-X-I
I-X-X-X-X-X-I   I-X-X-X-I
I-X-X-X-X-X-I   +-------+
I-X-X-X-X-X-I
+-----------+
```

两个方块之间严格地用三个空格隔开；任何一行的行尾都没有空格；没有一行是空行。 

按照样例推断图形，然后写一个程序，对于给定的 `N（1<=N<=14）` 和 `M（1<=M<=8）` 生成对应的方块设计。

## Input

第一行：两个用空格隔开的正整数，代表 `N` 和 `M`。

## Output

第一行至第若干行：按照上面描述做出的方块设计。

## Sample Input

```
5 3
```

## Sample Output

```
+-----------+   +-------+
I-X-X-X-X-X-I   I-X-X-X-I
I-X-X-X-X-X-I   I-X-X-X-I
I-X-X-X-X-X-I   I-X-X-X-I
I-X-X-X-X-X-I   +-------+
I-X-X-X-X-X-I
+-----------+
```

## References

[方块设计](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1761)

