学习笔记
关于扫雷问题：刚开始没有想明白[0,3]对应的格子为什么是'E'而不是'1'，后来仔细思考了一下，对应于题目中的第二条，因为dfs的过程中，如果碰到了数字就不会继续递归了，那么dfs的路径就无法经过[0,3]节点。
写了一个题解：https://leetcode-cn.com/problems/minesweeper/solution/dfsqiu-jie-sao-lei-yi-ji-03wei-shi-yao-b-sut6/
