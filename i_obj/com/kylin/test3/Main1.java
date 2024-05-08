package i_obj.com.kylin.test3;

import java.util.*; // 这样会降低编译速度，但不会降低运行速度

/**
 * 测试package和import
 */
public class Main1 {
    public static void main(String[] args) {
        // 在同一个类中导入了两个具有相同名称的类，不需要导入这两个类，直接使用完整的类名来区分它们。
        i_obj.com.kylin.test1.Car car = new i_obj.com.kylin.test1.Car();
        car.run();
        i_obj.com.kylin.test2.Car car2 = new i_obj.com.kylin.test2.Car();
        car2.stop();

        String str1 = "";
        java.lang.String str2 = "";
        System.out.println(str1 + str2);

        Date date = new Date();
        System.out.println(date);
    }
}
