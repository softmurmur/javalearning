package operator;

import java.util.Scanner;

public class operaterdemo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        通过键盘录入一个两位数
        System.out.println("请输入一个两位数：");
// 分析这个两位数的个位数字和十位数字
        int num = scanner.nextInt();
        int ten = num / 10;
        int unit = num % 10;
        Boolean result=ten==7||unit==7||num%7==0;
//判断这个数是否是回缘数
        System.out.println("这个数是否是回缘数？" + result);
    }
}
