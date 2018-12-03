# 整除3、5、7

## Description

判断每个整数是否能整除3、5、7。

## Input

输入数据中含有不多于50个正整数`n（0≤n≤2^31）`。

## Output

对于每个n，输出其整除的状态： 

- 只能整除3，不能整除5、7，则输出“3” 
- 只能整除5，不能整除3、7，则输出“5” 
- 只能整除7，不能整除3、5，则输出“7” 
- 只能整除3、5，不能整除7，则输出“3,5” 
- 只能整除3、7，不能整除5，则输出“3,7” 
- 只能整除5、7，不能整除3，则输出“5,7” 
- 能整除3、5、7，则输出“3,5,7” 
- 不能整除3、5、7，则输出“None” 

每个结果对应一行输出，输出格式见样本输出。

## Sample Input

```
5 6 7 8 15
```

## Sample Output

```
5-->5
6-->3
7-->7
8-->None
15-->3,5
```

## References

[整除3、5、7](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1184)
	