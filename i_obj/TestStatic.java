/**
 * 测试static的用法
 */
package i_obj;

public class TestStatic {
    static String company = "Linux";
    static String companyId = "0";

    static {
        System.out.println("类被初始化的调用！");
        companyId = "006";
    }

    static void printCompany() {
        System.out.println("公司名称：" + company + "，公司ID：" + companyId);
        // System.out.println(this); //static方法中不能使用非static成员！
    }

    void login() {
        System.out.println("登录");
    }

    public static void main(String[] args) {
        // static从属于类，不是对象，可以直接调用
        TestStatic.printCompany();

        // 对象不可以直接调用，需要创建
        TestStatic t1 = new TestStatic();
        t1.login();
        TestStatic t2 = new TestStatic();
        t2.login();
    }
}
