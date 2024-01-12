package i_obj;

public class KyLinStudent {
    int id;
    String name;
    int age;
    Computer computer;

    void study() {
        System.out.println("我正在学习！使用的电脑是：" + computer.brand);
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.brand = "ThinkPad";
        c1.price = 6000;

        Computer c2 = new Computer();
        c2.brand = "Dell";
        c2.price = 5000;

        KyLinStudent stu1 = new KyLinStudent();
        stu1.id = 1001;
        stu1.name = "KyLin";
        stu1.age = 24;
        stu1.computer = c1;

        stu1.study();
    }
}
