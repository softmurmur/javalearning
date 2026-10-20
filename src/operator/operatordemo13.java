package operator;

import java.util.Scanner;

public class operatordemo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//通过键盘输入一个数
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
//        通过键盘再输入一个数
        System.out.println("请输入另一个数：");
        int num2 = scanner.nextInt();
        int max = num > num2 ? num : num2;
        System.out.println("较大的数是：" + max);
    }
}
