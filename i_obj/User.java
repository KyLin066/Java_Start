/*
 * 模拟网站的账户（用于测试构造方法的重载）
 */

package i_obj;

public class User {

    int id;
    String userName; // 用户名
    String pwd; // 密码

    public User() {

    }

    public User(int _id) {
        id = _id;
    }

    public User(int _id, String _userName, String _pwd) {
        id = _id;
        userName = _userName;
        pwd = _pwd;
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(1001);
        User u3 = new User(1002, "KyLin", "123456");

        System.out.println(u1.id + u2.id + u3.userName);
    }
}
