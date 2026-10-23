package ifdemo;

import java.awt.image.MemoryImageSource;
import java.util.Scanner;

public class ifdemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个价格：");
        double price = scanner.nextDouble();
        double meiprice=0;
        double elmprice=0;
        if (price > 0) {
            if (price >= 30) {
                 meiprice=price-10;
            }else{meiprice=price;}
            System.out.println("使用美团的价格为:"+meiprice);
            elmprice=price*0.9;
            System.out.println("使用饿了么的价格为:"+elmprice);
            if (meiprice < elmprice) {
                System.out.println("使用美团更便宜");
            } else if (meiprice > elmprice) {
                System.out.println("使用饿了么更便宜");
            } else {
                System.out.println("使用美团和饿了么一样便宜");
            }



        } else {
            System.out.println("价格无效");
        }
    }
}
