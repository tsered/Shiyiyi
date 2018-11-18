# 画8

## Problem Description

谁画8画得好，画得快，今后就发得快，学业发达，事业发达。祝大家发，发，发。

## Input

输入的第一行为一个整数N，表示后面有N组数据。 每组数据中有一个字符和一个整数，字符表示画笔，整数（≥5）表示高度。

## Output

画横线总是1个字符粗，竖线随着总高度每增长6，而加1个字符宽。当总高度从5增到6时，其竖线宽度从1增长到2。下圈高度不小于上圈高度，但应尽量接近上圈高度，且下圈的内径呈正方形。每画一个“8”应空一行，但最前和最后都无空行。

## Sample Input

```
3
c 5
A 7
B 8
```

## Sample Output

```
 c
c c
 c
c c
 c

  AA
AA  AA
AA  AA
  AA
AA  AA
AA  AA
  AA

  BBB
BB   BB
BB   BB
  BBB
BB   BB
BB   BB
BB   BB
  BBB
```

## References

[画8](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1098)
