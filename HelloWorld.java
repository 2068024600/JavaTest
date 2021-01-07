import java.util.scanner;

public class HelloWorld {
    /* 第一个Java程序 
     * 它将输出字符串 Hello World
     */
    static String name;
    public static void main(String[] args) {
        HelloWorld me = new HelloWorld();
        me.name = new Scanner(System.in).nextLine();
        System.out.println(me.name);
        System.out.println("Hello World"); // 输出 Hello World
        int myNameValue = me.name; // 将输入的姓名转换成整数
    }
}

