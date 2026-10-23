package ifdemo;

import java.util.Scanner;

public class ifdemo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用电量：");
        int electricity = scanner.nextInt();
        if(electricity>0){if (electricity <= 100) {
            System.out.println("电费为：" + electricity * 0.5 + "元");
        } else if (electricity <= 200) {
            double price = (electricity - 100) * 0.8 + 50;
            System.out.println("电费为：" + price+ "元");

        } else {
            double price = (electricity - 200) * 1.2 + 130;
            System.out.println("电费为：" + price + "元");
        }

        }else{
            System.out.println("输入的用电量无效");
        }


    }
}
