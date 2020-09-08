# 算法
## 一、动态规划
### 1. 动态规划原理
1. 基本原理  
问题的最优解如果可以由子问题的最优解推导得到，则可以先求解子问题的最优解，在构造原问题的最优解；若子问题有较多的重复出现，则可以自底向上从最终子问题向原问题逐步求解。
2. 使用条件：可分为多个相关子问题，子问题的解被重复使用
3. 定义  
动态规划算法是通过拆分问题，定义问题状态和状态之间的关系，使得问题能够以递推（或者说分治）的方式去解决。
动态规划算法的基本思想与分治法类似，也是将待求解的问题分解为若干个子问题（阶段），按顺序求解子阶段，前一子问题的解，为后一子问题的求解提供了有用的信息。在求解任一子问题时，列出各种可能的局部解，通过决策保留那些有可能达到最优的局部解，丢弃其他局部解。依次解决各子问题，最后一个子问题就是初始问题的解。
4. 基本思想  
由于动态规划解决的问题多数有重叠子问题这个特点，为减少重复计算，对每一个子问题只解一次，将其不同阶段的不同状态保存在一个二维数组中。
5. 人话  
首先是拆分问题,我的理解就是根据问题的可能性把问题划分成一步一步这样就可以通过递推或者递归来实现.
关键就是这个步骤,动态规划有一类问题就是从后往前推到,有时候我们很容易知道:如果只有一种情况时,最佳的选择应该怎么做.然后根据这个最佳选择往前一步推导,得到前一步的最佳选择
然后就是定义问题状态和状态之间的关系,我的理解是前面拆分的步骤之间的关系,用一种量化的形式表现出来,类似于高中学的推导公式,因为这种式子很容易用程序写出来,也可以说对程序比较亲和(也就是最后所说的状态转移方程式)
我们再来看定义的下面的两段,我的理解是比如我们找到最优解,我们应该讲最优解保存下来,为了往前推导时能够使用前一步的最优解,在这个过程中难免有一些相比于最优解差的解,此时我们应该放弃,只保存最优解,这样我们每一次都把最优解保存了下来,大大降低了时间复杂度
### 2. 经典例题
1. 经典的数字三角形问题(简单易懂,经典动态规划);  
# JAVA
## 一、JAVA string类
### 1. 创建字符串
1. String 类有 11 种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数:
```
public class StringDemo{
   public static void main(String args[]){
      char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
      String helloString = new String(helloArray);  
      System.out.println( helloString );
   }
}
```
2. 注意：String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了
### 2. 方法
1. String 类的一个访问器方法是 length() 方法，它返回字符串对象包含的字符数。
2. 连接两个字符串string1.concat(string2);更常用的是使用'+'操作符来连接字符串。
3. charAt（）通过charAt方式获取第一个字符
String str = "adadsauo";//定义一个字符串
char fir = str.charAt(0);//获取字符串的第一个字符
charAt(int index)方法，返回字符串指定索引位置的char值。索引范围为0~length()-1
## 二、hashmap类  
### 1. 重要参数：
1. Size：储存的键值对对数；
2. loadFactor：负载因子，代表table最大的填充度，默认0.75，超过后会自动扩容。
3. capacity：容量，哈希表中桶的数量，默认初始为16，扩容后一定为2的n次幂。
### 2. 重要方法
```
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("zhang", "31");//存放键值对

		System.out.println(map.containsKey("zhang"));//键中是否包含这个数据
		System.out.println(map.containsKey("daniu"));
		System.out.println("=========================");

		System.out.println(map.get("zhang"));//通过键拿值
		System.out.println(map.get("daniu"));
		System.out.println("=========================");

		System.out.println(map.isEmpty());//判空
		System.out.println(map.size());
		System.out.println("=========================");

		System.out.println(map.remove("zhang"));//从键值中删除
		System.out.println(map.containsKey("zhang"));
		System.out.println(map.get("zhang"));//获取值
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println("=========================");

		map.put("zhang", "31");
		System.out.println(map.get("zhang"));
		map.put("zhang", "32");
		System.out.println(map.get("zhang"));
		System.out.println("=========================");

		map.put("zhang", "31");
		map.put("cheng", "32");
		map.put("yun", "33");

		for (String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("=========================");

		for (String values : map.values()) {
			System.out.println(values);
		}
		System.out.println("=========================");

		map.clear();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "1");
		map.put("E", "2");
		map.put("F", "3");
		map.put("G", "1");
		map.put("H", "2");
		map.put("I", "3");
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "," + value);
		}
		System.out.println("=========================");

		// you can not remove item in map when you use the iterator of map
		// for(Entry<String,String> entry : map.entrySet()){
		// if(!entry.getValue().equals("1")){
		// map.remove(entry.getKey());
		// }
		// }

		// if you want to remove items, collect them first, then remove them by
		// this way.
		List<String> removeKeys = new ArrayList<String>();
		for (Entry<String, String> entry : map.entrySet()) {
			if (!entry.getValue().equals("1")) {
				removeKeys.add(entry.getKey());
			}
		}
		for (String removeKey : removeKeys) {
			map.remove(removeKey);
		}
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "," + value);
		}
		System.out.println("=========================");

	}

}

```
### 3. hashmap不能用基本数据类型
```
今天使用HashMap时，发现不能使用基本数据类型，例如，HashMap<String, int> som = new HashMap<String, int>();

发现提示错误：Syntax error on token "int", Dimensions expected after this token。

后来从网上找到了答案，HashMap不能使用基本数据类型。

没有理解引用类型和原始类型。

Java 提供两种不同的类型：引用类型和原始类型（或内置类型）。Int是java的原始数据类型，Integer是java为int提供的封装类。Java为每个原始类型提供了封装类。

原始类型   封装类

boolean      Boolean

char           Character

byte           Byte

short          Short

int              Integer

long           Long

float           Float

double      Double
```
### 4. hashmap属于集合，集合用了remove就不能用迭代器了。
```
问题:
目标：想要在循环遍历的过程中删除集合中的元素，但是运行代码的时候遇到了这么一个错: java.util.ConcurrentModificationException: null
```
## 三、ArrayList类（菜鸟教程）
### 1. 引入初始化
1.引入初始化
```
ArrayList 类位于 java.util 包中，使用前需要引入它，语法格式如下：

import java.util.ArrayList; // 引入 ArrayList 类

ArrayList<E> objectName =new ArrayList<>();　 // 初始化
E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
objectName: 对象名。
ArrayList 是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
```  
2. 添加元素
```
添加元素
ArrayList 类提供了很多有用的方法，添加元素到 ArrayList 可以使用 add() 方法:
```
3. 访问元素
```
访问元素
访问 ArrayList 中的元素可以使用 get() 方法：
System.out.println(sites.get(1));  // 访问第二个元素
注意：数组的索引值从 0 开始
```
4. 修改元素
```
修改元素
如果要修改 ArrayList 中的元素可以使用 set() 方法：
 sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
```
5. 删除元素
```
如果要删除 ArrayList 中的元素可以使用 remove() 方法：
sites.remove(3); // 删除第四个元素
```
6. 计算大小
如果要计算 ArrayList 中的元素数量可以使用 size() 方法：
7. 迭代数组列表
我们可以使用 for 来迭代数组列表中的元素：
也可以使用 for-each 来迭代元素：
8. ArrayList 排序
Collections 类也是一个非常有用的类，位于 java.util 包中，提供的 sort() 方法可以对字符或数字列表进行排序。
以下实例对字母进行排序：Collections.sort(sites);  // 字母排序
### 2. 转换为String时
1. string.join 方法
String.join("sdfhjksdf", array);
```
以前我们循环字符串数组，并且要在每个元素的后面加一个符号的时候，我们总是要去处理首歌或者是最后一个加不加符号的问题，在引入jdk 1.8 以后，发现了一个特别好的api，就是这个：
public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("s1");
		list.add("s3");
		list.add("s5");
		list.add("s7");
		System.out.println(String.join(",", list));
	}
	输出结果为：

s1,s3,s5,s7

split() 方法根据匹配给定的正则表达式来拆分字符串。

语法
public String[] split(String regex,
                      int limit)

保留尾部空字符，limit参数 =-1
```