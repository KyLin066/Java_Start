package g_control_language;

public class TestBreak {
    // 测试break语句
    public static void main(String[] args) {
        // 产生100以内的随机数，直到随机数为66时终止循环
        int count = 0;
        while (true) {
            int num = (int) (Math.random() * 100);
            System.out.println(num);
            count++;
            if (num == 66) {
                break;
            }
        }
        System.out.println("一共循环了" + count + "次");
    }
}
