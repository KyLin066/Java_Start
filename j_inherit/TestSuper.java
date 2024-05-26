package j_inherit;

public class TestSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

class Parent {
    int num = 300;

    public Parent() {
        System.out.println("初始化父类对象！");
    }

    public void show() {
        System.out.println("父类中，show()");
    }
}

class Child extends Parent {
    int num = 1000;

    public Child() {
        // 即使不写下面这行代码，Java默认都会调用super()，含义是调用父类的无参数构造方法。
        // super();

        System.out.println("初始化子类对象！");
    }

    @Override
    public void show() {
        System.out.println("子类中，show()");
        super.show();
        System.out.println("子类的num：" + num);
        System.out.println("父类的num：" + super.num);
    }
}
