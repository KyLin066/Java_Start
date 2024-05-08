package i_obj.com.kylin.test3;

import static java.lang.Math.random;
import static java.lang.Math.*;

/**
 * 测试静态导入
 */
public class Main2 {
    public static void main(String[] args) {
        // 使用静态导入就不需要这种写法
        // Math.random();

        System.out.println(random());
        System.out.println(PI);
    }
}
