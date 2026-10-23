package ifdemo;

import java.util.Scanner;

public class ifdemo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的第一条边：");
        int a = scanner.nextInt();
        System.out.println("请输入三角形的第二条边：");
        int b = scanner.nextInt();
        System.out.println("请输入三角形的第三条边：");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("这是一个等边三角形");
            } else if (a == b || b == c || a == c) {
                System.out.println("这是一个等腰三角形");
            }else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                System.out.println("这是一个直角三角形");
            }

            else {
                System.out.println("这是一个普通三角形");
            }


        } else {
            System.out.println("这是一个无效三角形");
        }
    }
}
