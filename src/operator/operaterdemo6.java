package operator;

import java.util.Scanner;

public class operaterdemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        通过键盘输入一个秒数
        System.out.println("请输入一个秒数：");
        int second = sc.nextInt();
//       输出他的小时，分钟和秒数
        int hour = second / 3600;
        int minute = second % 3600 / 60;
        int remainingSeconds = second % 60;
        System.out.println(hour + "小时" + minute + "分钟" + remainingSeconds + "秒");
    }
}
