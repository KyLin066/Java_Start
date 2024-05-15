package k_object;

/**
 * 测试Object类的用法
 */
public class TestObject {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "张三");
        Employee e2 = new Employee(1001, "张三");
        System.out.println(e1); // 打印对象默认是调用的toString()

        System.out.println(e1 == e2); // 两个对象是否相同
        System.out.println(e1.equals(e2)); // 重写equals之后，两个对象是否相等（逻辑上某些值的比较）
    }
}

class Employee extends Object {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "雇员编号：" + id + "，姓名：" + name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
