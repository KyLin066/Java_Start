public class TestIntDouble {
    // Java基本数据类型之整型和浮点型
    public static void main(String[] args) {
        byte age = 20;
        short salary = 25000;
        int beijingPopulation = 30000000;

        // 整型常量默认的类型是int，改成long类型需要后面加：L/l
        long globalPopulation = 7000000000L;
        System.out.println("整型数据类型：" + age + "," + salary + "," + beijingPopulation + "," + globalPopulation);

        // 关于进制
        int t1 = 65; // 十进制
        int t2 = 065; // 八进制
        int t3 = 0x65; // 十六进制
        int t4 = 0b01000001; // 二进制

        System.out.println("十进制："+t1);
        System.out.println("八进制："+t2);
        System.out.println("十六进制："+t3);
        System.out.println("二进制："+t4);

        // 测试浮点数
        double d1 = 3.14;
        float f1 = 3.14F; // 浮点常量默认是

        double d2 = 314E-2; // 科学计数法：314*10^(-2)

        System.out.println("double型："+d1);
        System.out.println("float型："+f1);
        System.out.println("科学计数法："+d2);

        // 浮点数是不精确的，用于比较要小心
        // 如果要使用精确的运算，使用BigDecimal类
        float f3 = 0.1F;
        double d3 = 0.1;

        System.out.println(f3);
        System.out.println(d3);
        System.out.println(f3 == d3);
    }
}