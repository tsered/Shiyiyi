# 数单词数

## Description

一篇文章给了你，想了解一下里面什么样的单词出现频率最高，什么单词出现频率最低。语言学家就是仗着这种工具对作者进行研究的。

## Input

有若干段落的一篇文章。文章中可能出现数字字符，但不单独成词，标点符号只出现在单词的最后。

## Output

对每个单词输出其出现次数和占总单词数的比率，比率值保留两位小数，单词按字典序排序，单词按长度15右对齐，出现次数长度为二位数，随后便是空格和5位右对齐的比率值。

## Sample Input

```
I am a student.
```

## Sample Output

```
              I: 1 25.00%
              a: 1 25.00%
             am: 1 25.00%
        student: 1 25.00%
```