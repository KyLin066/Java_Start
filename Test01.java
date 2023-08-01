public class Test01 {
	// Java 标识符以及变量的本质
	public static void main(String[] args) {
		// 以下为合规的标识符
		// int age = 18;
		// int _age = 19;
		// int $age = 20;
		// int age123 = 21;
		// int 年龄 = 22;

		// 以下为不合规的标识符
		// int 123age = 23; // 数字不能做开头
		// int age# = 24; // 标识符只能是：字母、数字、下划线和$
		// int class = 25; // 标识符不能是关键字

		// 变量的本质
		int monthlySalary = 15000;
		int annualSalary = monthlySalary * 12;
		System.out.println("年薪：" + annualSalary);

		double bonus = 3000.1;
		System.out.println("奖金：" + bonus);
	}
}