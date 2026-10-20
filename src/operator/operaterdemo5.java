package operator;

import java.util.Scanner;

public class operaterdemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//通过键盘输入一个三位数
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        System.out.println("这个三位数的个位数是：" + num % 10);
        System.out.println("这个三位数的十位数是：" + num / 10 % 10);
        System.out.println("这个三位数的百位数是：" + num / 100);
    }
}
