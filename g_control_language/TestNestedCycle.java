package g_control_language;

public class TestNestedCycle {
    // 测试嵌套循环
    public static void main(String[] args) {
        // 打印输出十行，每行输出0-9
        for (int line = 0; line < 10; line++) {
            for (int num = 0; num < 10; num++) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        // 输出一个直角三角形
        System.out.println("输出一个直角三角形：");

        for (int line = 1; line <= 5; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        // 输出一个倒立直角三角形
        System.out.println("输出一个倒立直角三角形：");

        for (int line = 1; line <= 5; line++) {
            for (int num = 1; num <= 6 - line; num++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        // 输出一个等腰三角形
        System.out.println("输出一个等腰三角形：");
        int tag = 4;
        for (int line = 0; line < 5; line++) {
            for (int num = 0; num < 10; num++) {
                if (num >= tag - line && num <= tag + line) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
