package operator;

import java.util.Scanner;

public class operatordemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        键盘录入一个三位数
        System.out.println("请输入一个三位数：");
        int num = scanner.nextInt();
//        分别显示出这个三位数的个位数字，十位数字，百位数字
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        System.out.println("个位数字是：" + ge);
        System.out.println("十位数字是：" + shi);
        System.out.println("百位数字是：" + bai);

    }
}
