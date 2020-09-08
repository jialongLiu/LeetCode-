import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;




public class Array{
    public static void main(String[] args) {
        Array test = new Array();
        // String str = test.input();//测试输入
        // test.print(str);//测试输出
        // test.hashMap();//测试hashmap
        // test.printArrayList();//测试ArrayList
        // test.changestring();//测试ArrayList转换为string类
        test.manyarray();//测试多维数组
    }

    // 输入字符串
    String input(){
        System.out.println("请输入字符串数据：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }
    // 输出字符串（str）
    void print(String str){
        System.out.println("字符串数据为："+str);
        // System.out.println("字符串数据3为："+str);
        System.out.println(str.charAt(2));//输出索引为2的字符。
    }

    // 测试hashmap
    void hashMap(){
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(5, "dfdsfs");
        hash.put(4, "woshi");
        hash.put(3, "Liu家");
        System.out.println(hash.get(hash.size()));
    }

    // 测试ArrayList类
    void printArrayList(){
        ArrayList<String> alist = new ArrayList<>();
        alist.add("我是家龙！");
        alist.add("你是谁？");
        alist.add("i love you!");
        alist.set(2, "i like you!");
        alist.remove(0);
        String t = alist.get(1);
        System.out.println(t);
        for(String s: alist){
            System.out.println(s);
        }
    }
    // 测试ArrayList转String类
    void changestring(){
        ArrayList<String> array = new ArrayList<>();
        array.add("a");
        array.add("q");
        array.add("f");
        array.add("e");
        System.out.println(array);
        String res = String.join("sdfhjksdf", array);
        System.out.println(res);
        String nullstring = " 0 ";
        String[] stringarray = nullstring.split(" ",-1);
        for(int i=0;i<stringarray.length;i++)System.out.println(stringarray[i]);
    }
    // 测试多维数组
    void manyarray(){
    int[][] array = new int[5][6];
    int[][] darray = {{8,7},{5,6},{3,4},{1,2}};
    System.out.println(Arrays.toString(darray[2]) );
    int dlen1=darray.length;
    int dlen2 = darray[2].length;
    int[][] unruleArray = {{3,5},{5,4,1,1},{2,3,4},{1}};
    System.out.println("unruleArray");
    }
}