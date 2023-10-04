package g_control_language;

public class TestBreakContinue {
    // Java的Break和Continue语句综合练习
    public static void main(String[] args) {
        /*
         * 抓动物小游戏
         * 每次随机出现一个动物
         * 如果出现老虎，则游戏结束；如果出现老鹰，躲起来，等待下一个动物出现
         * 如果出现小猫、小狗、小鸟和小乌龟，可以抓住。计数，抓住多少个动物
         */

        // 0-老虎 1-老鹰 2-小猫 3-小狗 4-小鸟 5-小乌龟
        int total = 0;
        int cat = 0;
        int dog = 0;
        int bird = 0;
        int tortoise = 0;

        while (true) {
            int animal = (int) (Math.random() * 6);
            if (animal == 0) {
                System.out.println("老虎出现，撤退撤退！");
                break;
            } else if (animal == 1) {
                System.out.println("老鹰出现，注意注意，先躲起来");
                continue;
            } else if (animal == 2) {
                System.out.println("发现一只小猫，抓住");
                total++;
                cat++;
            } else if (animal == 3) {
                System.out.println("发现一只小狗，抓住");
                total++;
                dog++;
            } else if (animal == 4) {
                System.out.println("发现一只小鸟，抓住");
                total++;
                bird++;
            } else {
                System.out.println("发现一只小乌龟，抓住");
                total++;
                tortoise++;
            }
        }

        System.out.println("一个共抓到了" + total + "只动物");
        System.out.println("一个共抓到了" + cat + "只小猫");
        System.out.println("一个共抓到了" + dog + "只小狗");
        System.out.println("一个共抓到了" + bird + "只小鸟");
        System.out.println("一个共抓到了" + tortoise + "只小乌龟");
    }
}
