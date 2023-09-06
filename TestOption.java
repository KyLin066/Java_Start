public class TestOption {
    // 测试选择结构
    public static void main(String[] args) {
        // System.out.println(Math.random()); // [0, 1)的随机数

        // [0, 10)的随机数
        int r = (int) (Math.random() * 10);
        System.out.println(r);

        // 如果r小于5，则打印“数比较小”
        if (r < 5) {
            System.out.println("数比较小");
        } else {
            System.out.println("数比较大");
        }

        // 生成一个在[0, 100]表示年龄的随机数
        // 13岁以下是儿童，13-35青年，36-59中年，60-85老年,85以上老寿星
        int age = (int) (Math.random() * 100);
        System.out.println("年龄" + age);
        if (age < 13) {
            System.out.println("儿童，珍惜童年的时光");
        } else if (age < 36) {
            System.out.println("青年，勇敢追逐自己的梦想");
        } else if (age < 60) {
            System.out.println("中年，不要虚度光阴");
        } else if (age < 86) {
            System.out.println("老年，好好享受养老生活");
        } else {
            System.out.println("老寿星，继续热爱生活吧");
        }

        // 随机生成a-z的字母；如果是a、e、i、o、u则输出“元音”，否则“辅音”
        int num = (int) (Math.random() * 26);
        char letter = 'a';
        letter = (char) (letter + num);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == '0' || letter == 'u') {
            System.out.println("元音：" + letter);
        } else {
            System.out.println("辅音：" + letter);
        }

        // switch语句
        // grade表示大学年级
        int grade = (int) ((Math.random() * 4) + 1);

        switch (grade) {
            case 1:
                System.out.println("大学" + grade + "年级");
                break;
            case 2:
                System.out.println("大学" + grade + "年级");
                break;
            case 3:
                System.out.println("大学" + grade + "年级");
                break;
            default:
                System.out.println("大学" + grade + "年级");
                break;
        }

        // 判断季节
        int month = (int) ((Math.random() * 12) + 1);

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            default:
                System.out.println("冬季");
                break;
        }

        // 买车情况
        String car = "奔驰";

        switch (car) {
            case "奔驰":
                System.out.println("奔驰是一款经典汽车，它以其优雅的外观和卓越的性能而闻名。");
                break;
            case "宝马":
                System.out.println("宝马是一款豪华汽车，它拥有优秀的性能和舒适的驾驶体验。");
                break;
            case "奥迪":
                System.out.println("奥迪是一款高端汽车，它以其先进的技术和出色的性能而受到欢迎。");
                break;
            default:
                System.out.println("对不起，我不知道你买的是什么车。");
        }

        // 阿拉伯数字转换成大写汉字
        int number = (int) (Math.random() * 10);
        char s = ' ';

        switch (number) {
            case 0:
                s = '零';
                break;
            case 1:
                s = '壹';
                break;
            case 2:
                s = '贰';
                break;
            case 3:
                s = '叁';
                break;
            case 4:
                s = '肆';
                break;
            case 5:
                s = '伍';
                break;
            case 6:
                s = '陆';
                break;
            case 7:
                s = '柒';
                break;
            case 8:
                s = '捌';
                break;
            case 9:
                s = '玖';
                break;
        }

        System.out.println("阿拉伯数字：" + number + "，对应的大写汉字：" + s);

        // 系统角色
        String role = "超级管理员";
        int roleNum = 0;
        switch (role) {
            case "超级管理员":
                roleNum = 1;
                break;
            case "普通用户":
                roleNum = 2;
                break;
            default:
                roleNum = 3;
                break;
        }

        System.out.println(role + "------" + roleNum);

        // 超市会员积分奖励活动
        int score = (int) (Math.random() * 10000);
        System.out.println("用户积分：" + score);
        switch (score / 1000) {
            case 9:
            case 8:
            case 7:
                System.out.println("一等奖，奖励苹果20一台");
                break;
            case 6:
            case 5:
                System.out.println("二等奖，奖励苹果14一台");
                break;
            case 4:
            case 3:
                System.out.println("三等奖，奖励烟台苹果一筐");
                break;
            default:
                System.out.println("无奖励");
                break;
        }
    }
}
