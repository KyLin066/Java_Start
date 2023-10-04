package f_keypad_input;

import java.util.Scanner;

public class TestSystemIn {
    // 测试键盘输入
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入您的用户名：");
            String userName = scanner.nextLine();
            System.out.print("请输入您的年龄：");
            int age = scanner.nextInt();
            System.out.print("请输入您的月薪：");
            double salary = scanner.nextDouble();

            System.out.println("======录入的信息如下======");
            System.out.println("用户名：" + userName);
            System.out.println("年龄：" + age);
            System.out.println("年薪：" + (salary * 12));
        }
    }
}
