public class TestControlSynthesis {
    // 控制语句综合练习
    public static void main(String[] args) {
        // 使用for循环，打印出a-z的26个字母
        char letter = 'a';
        for (int num = 0; num < 26; num++) {
            char temp = (char) (letter + num);
            System.out.print(temp + " ");
        }

        System.out.println();

        // 打印九九乘法表
        System.out.println("打印九九乘法表：");
        for (int num1 = 1; num1 <= 9; num1++) {
            for (int num2 = 1; num2 <= num1; num2++) {
                System.out.print(num1 + "*" + num2 + "=" + num1 * num2 + "\t");
            }
            System.out.println();
        }
    }
}
