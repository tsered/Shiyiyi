# 统计图

## Description

lily刚学了数理统计，他对频率直方图特感兴趣，所以想对一篇文章的字母进行统计。

而文章是由四行的大写字母组成的(CAPITAL LETTERS)。每行不会超过72个字符，请打印一个统计直方图来统计每个字母出现的次数 (不统计空行，数字，标点)。

## Input

1到4行的大写文章，每行不超过72个字符。

## Output

打印统计图，具体如样例（最后不要空行）。

## Sample Input

```
THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG.
THIS IS AN EXAMPLE TO TEST FOR YOUR
HISTOGRAM PROGRAM.
HELLO!
```

## Sample Output

```
                            *                      
                            *                      
        *                   *                      
        *                   *     *   *            
        *                   *     *   *            
*       *     *             *     *   *            
*       *     * *     * *   *     * * *            
*       *   * * *     * *   * *   * * * *         
*     * * * * * *     * * * * *   * * * *     * *  
* * * * * * * * * * * * * * * * * * * * * * * * * *
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
```

## References

[统计图](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1064)
