package h_method;

public class TestOverload {
    public static void main(String[] args) {
        add(100, 200);
        add(100.1, 200);
        add(100, 200, 300);
        add(100, 200.6);
    }

    // 求和的方法
    public static int add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println(sum);
        return sum;
    }

    // 方法名相同，参数类型不同，构成重载
    public static double add(double n1, int n2) {
        double sum = n1 + n2;
        System.out.println(sum);
        return sum;
    }

    // 方法名相同，参数个数不同，构成重载
    public static int add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        System.out.println(sum);
        return sum;
    }

    // 方法名相同，参数顺序不同，构成重载
    public static double add(int n1, double n2) {
        double sum = n1 + n2;
        System.out.println(sum);
        return sum;
    }
}
