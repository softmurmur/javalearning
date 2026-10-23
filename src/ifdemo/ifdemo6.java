package ifdemo;

import java.util.Scanner;

public class ifdemo6 {
    public static void main(String[] args) {
        double yhjprice = 0;
        double hykprice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入所买东西的价格：");
        double price = scanner.nextDouble();
        if (price > 0) {
            if (price < 10) {
                yhjprice = price;}
            else if (price < 50) {
                yhjprice = price - 8;
            }
            else if (price < 100){
                yhjprice = price -30;}
            else if (price < 200){
                yhjprice = price -50;
            }
            else {
                yhjprice = price -90;
            }
            System.out.println("使用优惠券的价格为：" + yhjprice);
            hykprice=price*0.8;
            System.out.println("使用会员卡的价格为：" + hykprice);
        } else {
            System.out.println("价格无效");
        }
        if (yhjprice < hykprice) {
            System.out.println("使用优惠券更便宜");
        } else if (yhjprice > hykprice) {
            System.out.println("使用会员卡更便宜");
        } else {
            System.out.println("使用优惠券和会员卡一样便宜");
        }
    }
}