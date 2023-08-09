public class TestTypeConvert {
    // 测试基本数据类型的转换（自动转换、强制转换）
    public static void main(String[] args) {
        // 自动类型转换：表数范围小的可以自动转换为表数范围大的
        long a1 = 3456;
        float a2 = a1;
        System.out.println(a2);

        // 整型常量直接赋值给byte/short/char等类型，只要不超过表数范围，则可以自动转换
        // byte b1 = 121;
        // byte b2 = 200; // byte：[-128, 127]，200超过byte的表数范围，则不合法

        // 算术运算符，两个操作数都是整型：有一个是long，则结果为long。否则结果为int（即使byte，结果也是int）
        long c1 = 1234;
        int c2 = 123;
        long c3 = c1 + c2;
        System.out.println(c3);

        // 算术运算符，有一个操作数是double，则结果是double
        double d1 = 3.14;
        int d2 = 3;
        double d3 = d1 + d2;
        System.out.println(d3);

        // 强制类型转换
        double e1 = 3.98;
        int e2 = (int) e1;
        System.out.println(e2);

        char e3 = 'c';
        int e4 = e3 + 2;
        char e5 = (char) e4;
        System.out.println(e5);

        // 当将一种类型强制转换成另一种类型，而又超出了目标类型的表数范围，就会被截断成一个完全不同的值。
        int f1 = 300;
        byte f2 = (byte) f1;
        System.out.println(f2);
    }
}