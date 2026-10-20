package ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args) {
//        通过键盘输入一个温度
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个温度：");
        int temperature = scanner.nextInt();
//        判断温度是否大于0
        if (temperature >= 38) {
            System.out.println("语音警告，当前温度超过38度");
        }
        else {
            System.out.println("当前温度正常");
        }
    }
}
