# leetcode经验帖
## 一、如何科学的刷leetcode
### 1. 经验
1. 算法不是拼智商  
算法不是纯粹拼智商的，智商高，就一定很厉害，不够聪明，就一定不行。算法是一种技能，是可以通过科学合理的方式训练出来的能力。
2. 难度要循序渐进  
如果你本身有基础，熟练度高，那你刷简单的leetcode应该是几分钟一题，几分钟一题的，花不了你多少时间。
如果你刷简单都花费很长时间，说明熟练度不够，就更应该从简单开始。
然后过度到中等，再过度到困难。
3. 按算法分类来选题  
这种做法可以极大的提高刷题的速度，而且能带来更好的效果。可以不断地巩固和加深理解。可以更全面地接触这个数据结构，算法的各个变种。
### 2. 解题三部曲
1. 看懂题目  
我的一个经验是，拿到一个题目后，看5分钟，如果5分钟之内看不懂，我就mark 下来，留到后面再做，要不很影响刷题的心情。
2. 分析，推导解法  
分析推导题目解法的时候，不要去想任何实现相关地事情，不用去想代码怎么写，不用去想要用什么库，定义什么变量，用多少层循环，都不要想，就想着在逻辑上，这道题目要怎么解。
3. 将思路转换为代码  
怎么定义变量，保存状态，用递归，还是用循环加辅助数据结构等等，都是将思路转换成代码要做的事情。
### 3. 算法的封装
1. 比如一道题目的正确解法是先排序，再进行二分查找，那你的脑子里面只要记得，快速排序和二分查找，就可以了，不需要去想，快速排序和二分查找的具体实现。
2. 用封装的思维去解题，你的解题能力会有快速地提升。
3. 在实际的面试或比赛中，除非有特殊说明，一般都可以放心地使用语言的内置算法和数据结构。然后你可能会问，对于像排序，查找这些基础的算法应该怎么对待呢？我的建议是可以把它们当作重要算法来刻意练习。快排，快搜，堆排序等，我们可以称它们为元算法。
# 怎样使用OJ刷题
## 一、JAVA语法
### 1. java程序要求
1. 源文件名必须和类名相同。
2. 所有的 Java 程序由 public static void main(String[] args) 方法开始执行。
3. 一个源文件中只能有一个 public 类
4. 源文件的名称应该和 public 类的类名保持一致。
5. 如果一个类定义在某个包中，那么 package 语句应该在源文件的首行。
6. 如果源文件包含 import 语句，那么应该放在 package 语句和类定义之间。如果没有 package 语句，那么 import 语句应该在源文件中最前面。
7. import 语句和 package 语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
### 2. 面向对象基本语法
1. 调用构造方法，必须用new操作符。
### 3. 程序固定
1. 输入  
首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头，后面我们在Java的package中会详细讲解如何使用import。
然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。
有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}
```
2. 输入报错  
Java编写程序时出现警告：Resource leak: 'xxx' is never closed 解决方案  
百度了一下，意思是申明了名为a的数据输入扫描仪（Scanner），系统就会为它分配相应的内存空间，但是在程序结时却没有释放该内存，会造成资源浪费，从而出现警告。
解决方法：在main()函数结束时调用xxx.close();函数结束数据流，释放内存
3. 输出报错  
Java中的 Invalid character constant（无效的字符常数）
将双引号误写成单引号，会出现这个错误。
4. 关于程序入口
入口(Entry of Program)：指程序运行的起点。
只有main方法可以作为程序的入口。
如果没有main函数，这个Java文件压根不执行。
# JAVA基本语法
## 一、JAVA数组
### 1. For-Each 循环
1. 语法格式
```
for(type element: array)
{
    System.out.println(element);
}
```
### 2. 创建数组
Java语言使用new操作符来创建数组，语法如下：

arrayRefVar = new dataType[arraySize];
### 3. 初始化数组
```
普通的bai赋值是:int[][] i = {{1,2,3},{2,3,4},{1,3,4}};
如果是其他情况可以这bai样：比如：

import java.util.*

public class TT(){

public static void main(String[] args){

int m=0;

for(int i=0 ;i<5;i++){

for(int j=0;j<5;j++)

a[i][j]=m;

m++;

}

}

}

这是一个给二维数组du赋值的zhi例子 把0到25赋值给数组a。
```
# JAVA报错
## 一、hashmap
### 1. null问题  
Syntax error, insert "Dimensions" to complete TypeArgument
语法错误，插入“维度”来完成类型参数
原因分析：
产生此错误的原因是因为 HashMap对象的 key 值可为null，但 Java 的基本类型是不可以为 null 的。
解决方法：
使用可以为 null 的类型，代码如下：
Map<Integer, SocketChannel> socketChannelMap = new HashMap<Integer, SocketChannel>();
提示：
HashMap对象的key、value值均可为null。
HahTable对象的key、value值均不可为null。
### 2. 迭代器问题
	char[] toCharArray()
将此字符串转换为一个新的字符数组。