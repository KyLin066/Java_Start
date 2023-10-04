package g_control_language;

public class TestContinue {
    // 测试continue语句
    public static void main(String[] args) {
        // 把100-150之间不能被3整除的数输出，并且每行输出5个
        int count = 0; // 计数器：表示每行输出几个
        for (int num = 100; num <= 150; num++) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.print(num + "\t");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
