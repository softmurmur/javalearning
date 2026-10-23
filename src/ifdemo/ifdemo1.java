package ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入温度：");
        double temperture = scanner.nextDouble();
        if(temperture>=38){
            System.out.println("语音警报，当前体温过高");
        }else{
            System.out.println("当前体温正常");
        }

    }
}
