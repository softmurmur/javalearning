package operator;

import java.util.Scanner;

public class operatordemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        通过键盘输入一个秒数
        System.out.println("请输入一个秒数：");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
//        输出结果为几小时几分钟几秒，且小时，分钟，秒都不可超过59
        System.out.println(hours + "小时" + minutes + "分钟" + remainingSeconds + "秒");

    }
}
