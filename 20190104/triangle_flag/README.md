# 三角旗飘飘

## Description

一根绳子上挂了若干个三角旗，三角旗有大有小，各个三角旗用整数规定其尺寸，用字符规定其图案，请你画出所有绳子上的三角旗图形。

## Input

一上来有一个正整数 `N(1<N<100)`，表示有 `N` 根三角旗的绳子。

每根三角旗绳子开始以一个整数 `n(1<n<100)`，表示该绳子上有 `n` 个三角旗。

接着有 `n` 对数据，每对数据包括一个正整数（表示三角旗边长(`<30`)）和一个字符（表示三角旗的填充图案）。

## Output

按输出样本，先往右后往左，一左一右，画出全部绳子上的全部三角旗。左边最大的三角旗应顶左边沿。每根三角旗绳子之间空一行，最上与最下不空行。

## Sample Input

```
2
3 3 A 5 B 2 C
2 5 X 4 Y
```

## Sample Output

```
    A
    AA
    AAA
    B
   BB
  BBB
 BBBB
BBBBB
    C
    CC

   X
   XX
   XXX
   XXXX
   XXXXX
   Y
  YY
 YYY
YYYY
```

## References

[三角旗飘飘](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1823)
