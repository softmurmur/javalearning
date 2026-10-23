package ifdemo;

import java.util.Scanner;

public class ifdemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
       if(num>0) {if (num % 2 == 0) {
           num =num/2;
       } else {
           num=3*num+1;
       }
       }else{
           System.out.println("输入的数字无效");
       }

        System.out.println("结果是：" + num);
    }
}
