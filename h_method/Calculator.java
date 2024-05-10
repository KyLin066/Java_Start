package h_method;

import java.util.Scanner;

// 实现一个计算器
public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入一个算术表达式：");
            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            double num1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double num2 = Double.parseDouble(parts[2]);

            switch (operator) {
                case "+":
                    System.out.println("结果: " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("结果: " + subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("结果: " + multiply(num1, num2));
                    break;
                case "/":
                    System.out.println("结果: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("未知的运算符: " + operator);
                    break;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // 相加操作
    public static double add(double n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }

    // 相减操作
    public static double subtract(double n1, double n2) {
        double sum = n1 - n2;
        return sum;
    }

    // 相乘操作
    public static double multiply(double n1, double n2) {
        double sum = n1 * n2;
        return sum;
    }

    // 相除操作
    public static double divide(double n1, double n2) {
        double sum = n1 / n2;
        return sum;
    }
}
