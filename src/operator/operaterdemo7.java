package operator;

import java.util.Scanner;

public class operaterdemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        通过键盘输入我的身高
        System.out.println("请输入我的身高：");
        double height = scanner.nextDouble();
//        通过键盘输入好朋友的身高
        System.out.println("请输入好朋友的身高：");
        double friendHeight = scanner.nextDouble();
//        比较两者的身高，若我比好朋友高则输出true，反之为false
        boolean result = height > friendHeight;
        System.out.println(result);
    }
}
