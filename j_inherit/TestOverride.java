package j_inherit;

/**
 * 测试重写
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.run();

        Plane p1 = new Plane();
        p1.stop();
    }
}

class Vehicle {
    public void run() {
        System.out.println("run…");
    }

    public void stop() {
        System.out.println("stop…");
    }
}

class Horse extends Vehicle {
    @Override
    public void run() {
        System.out.println("四蹄纷飞，嘚嘚…");
    }
}

class Plane extends Vehicle {
    @Override
    public void run() {
        System.out.println("在空中飞…");
    }

    @Override
    public void stop() {
        System.out.println("在机场停下，不能在空中停");
    }
}
