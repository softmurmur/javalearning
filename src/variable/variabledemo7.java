package variable;

import java.util.Scanner;

public class variabledemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        让键盘接收第一次录入的整数，接收过程给出提示语，为请输入第一个整数
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
//        让键盘接收第二次录入的整数
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

//        计算两个整数的和并打印
        int sum = num1 + num2;
        System.out.println("两个整数的和是："+sum);
    }
}
