package h_method;

// 测试方法的定义和调用
public class TestMethod {
    // main方法，程序的主入口
    public static void main(String[] args) {
        int a1 = add(100, 200);
        int a2 = add(200, 300);
        int sum = add(a1, a2); // 实际参数
        System.out.println(sum);

        printInfo();
    }

    // 定义一个求和的方法（有参数，有返回值）
    public static int add(int n1, int n2) { // 形式参数
        int sum = n1 + n2;
        return sum;
    }

    // 定义一个打印信息的方法（没有参数，没有返回值）
    public static void printInfo() {
        System.out.println("KyLin");
    }
}
