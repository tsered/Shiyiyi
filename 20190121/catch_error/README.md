# 捕捉错误

## Description

小明最近闲来无事，编写了一段可以用来判断一行包含空格的字符串是否合法的代码，就整天向人炫耀，其实对你们来说是很水的一段代码，随便几分钟就能搞定。

一行字符串只要包含以下四种情况中的一种就算不合法。 

- 1、含有两个连续的大写字母。 
- 2、含有一个数字与一个字母相邻。 
- 3、除了a、I、A这三个字符外，含有一个孤立的字符。（一个字符前后都是空格就算孤立） 
- 4、含有两个连续的标点符号，如果其中有一个是双引号则例外。

## Input

输入包含多组测试数据。 每组测试数据包含一行字符串，字符串最长为 80 个字符。 输入以只包含一个 `#` 字符的一行结束。

## Output

针对每组测试数据，若为合法的字符串，则输出 `OK`, 否则输出 `suspicious`。

## Sample Input

```
"This is a safe message," said 50 wise men.
DON'T b l8 for the Apple ][ user's group meeting.
I ate at "Al's Big Burritos" for lunch!
It's not OK to burp at your grandmother.
*BuT* YoU _CaN_ Do ThIs, YoU KnOw.
We 8 eight oranges.
#
```

## Sample Output

```
OK
suspicious
OK
suspicious
OK
suspicious
```

## References

[捕捉错误](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1435)
