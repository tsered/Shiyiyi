# 折纸游戏

## Description

fans喜欢玩折纸游戏。整张纸被分成m\*m个格子，即构成一个方阵，每个格子里面都写了一个正整数。游戏分两步：首先左右对折，如果对应的格子的数字都相同，那么进行下一步操作；否则停止游戏，此时游戏的结果是"no"。然后上下对折，如果对应的格子的数字相同，那么游戏的结果是“yes”；否则停止游戏，游戏的的结果是"no"。

## Input

第一个数为方阵的个数n，接着就是每个方阵的数据，每个方阵的第一行为该方阵的阶m，后跟m\*m个元素。

## Output

如果对应的格子的数字相同，那么游戏的结果是“yes”；否则停止游戏，游戏的的结果是“no”。

## Sample Input

```
2
3
1 2 1
3 5 3
1 2 1
4
2 1 1 2
1 2 3 4
4 3 2 1
2 1 1 2
```

## Sample Output

```
yes
no
```

## References

[折纸游戏](http://cpp.zjut.edu.cn/ShowProblem.aspx?ShowID=1016)
