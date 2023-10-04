package g_control_language;

public class TestCircuit {
    // 测试循环结构
    public static void main(String[] args) {
        // 打印 1-100
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        // 计算 1-100的和
        int num = 0;
        int sum = 0;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("1-100的和：" + sum);

        // 使用for循环打印 1-100
        System.out.println("for循环打印1-100：");
        for (int n = 0; n <= 100; n++) {
            System.out.println(n);
        }

        // 使用for循环计算 1-100的和
        int total = 0;
        for (int m = 0; m <= 100; m++) {
            total += m;
        }
        System.out.println("for循环计算1-100的和：" + total);
    }
}
