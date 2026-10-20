package operator;

import java.util.Scanner;

public class operaterdemo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        通过键盘输入一个四位数
        System.out.println("请输入一个四位数：");
        int num = scanner.nextInt();
//        获取这个四位数的各个位数上的数字
        int thousand = num / 1000;
        int hundred = num / 100 % 10;
        int ten = num / 10 % 10;
        int unit = num % 10;

        boolean result=thousand==unit&&hundred==ten;
        System.out.println("这个数是回文数吗？" + result);
    }
}
