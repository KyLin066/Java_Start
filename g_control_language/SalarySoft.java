package g_control_language;

/*
 * 年薪计算小软件
 */
import java.util.Scanner;

public class SalarySoft {
    /*
     * 薪水计算器
     * 1.通过键盘输入用户的月薪，每年是几个月的薪水
     * 2.输出用户的年薪
     * 3.输出一行字“如果年薪超过10万，恭喜你超越90%的人”，“如果年薪超过20万，恭喜你超越98%的人”
     * 4.直到键盘输入数字88，则退出程序
     * 5.输入中途，键盘输入数字66，则这个用户退出计算不显示“恭喜……”，直接显示“重新开始计算……”，然后算下一个用户的年薪
     */
    public static void main(String[] args) {
        System.out.println("年薪计算小程序");
        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("请输入您的月薪：");
                int salary = scanner.nextInt();
                System.out.print("请问您每年领几个月的薪水：");
                int month = scanner.nextInt();

                int result = salary * month;
                if (result >= 100000 && result < 200000) {
                    System.out.println("恭喜你超越90%的人");
                    System.out.println("您的年薪是" + salary * month);
                } else if (result >= 200000) {
                    System.out.println("恭喜你超越98%的人");
                    System.out.println("您的年薪是" + salary * month);
                } else {
                    System.out.println("您的年薪是" + salary * month);
                }

                System.out.println("请输入命令：[66]继续  [88]退出");
                int tag = scanner.nextInt();
                if (tag == 88) {
                    System.out.println("程序结束");
                    break;
                }
                if (tag == 66) {
                    System.out.println("请重新输入数据");
                    continue;
                }
            }
        }
    }
}
