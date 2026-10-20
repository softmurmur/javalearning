package ifdemo;

import java.util.Scanner;

public class ifdemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入价格：");
        int a = scanner.nextInt();
//        定义一个变量记录使用饿了嘛需要的价格
        double elm = a * 0.9;
        System.out.println("使用饿了嘛需要支付：" + elm);
        double mt =0;
        if (a >=30) {
            mt=a-10;
            System.out.println("使用美团需要支付：" + mt);
        } else {
            mt=a;
            System.out.println("使用美团需要支付：" +mt);}

            if (elm < mt) {
                System.out.println("使用饿了嘛更便宜");
            }
            else if (elm > mt) {
                System.out.println("使用美团更便宜");
            }
            else {
                System.out.println("使用饿了嘛和美团一样便宜");
            }
        }

    }

