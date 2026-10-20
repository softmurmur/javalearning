package homework;

import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//先给用户提示语请输入一个整数，然后用户通过键盘录入一个整数
        System.out.print("请输入一个整数：");
        int num1 = scanner.nextInt();
//        先给用户提示语请输入另一个整数，然后用户通过键盘录入另一个整数
        System.out.print("请输入另一个整数：");
        int num2 = scanner.nextInt();
//        计算两个整数的和
        int sum = num1 + num2;
        System.out.println("两个整数的和为：" + sum);
//        计算第一个整数减去第二个整数的差
        int difference = num1 - num2;
        System.out.println("第一个整数减去第二个整数的差为：" + difference);
//      计算两个整数的乘积
        int product = num1 * num2;
        System.out.println("两个整数的乘积为：" + product);
//        计算两个整数的平均数
        double average = (num1 + num2) / 2.0;
        System.out.println("两个整数的平均数为：" + average);
    }
}
