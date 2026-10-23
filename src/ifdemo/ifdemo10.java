package ifdemo;

import java.util.Scanner;

public class ifdemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个x轴的坐标：");
        double x = scanner.nextDouble();
        System.out.println("请输入一个y轴的坐标：");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("点在第一象限");
        } else if (x < 0 && y > 0) {
            System.out.println("点在第二象限");
        } else if (x < 0 && y < 0) {
            System.out.println("点在第三象限");
        } else if (x > 0 && y < 0) {
            System.out.println("点在第四象限");
        } else if (x == 0 && y != 0) {
            System.out.println("点在y轴上");
        } else if (x != 0 && y == 0) {
            System.out.println("点在x轴上");
        } else {
            System.out.println("点在原点");
        }
    }
}
