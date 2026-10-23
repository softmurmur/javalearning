package ifdemo;

import java.util.Scanner;

public class ifdemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        double score=scanner.nextDouble();
        if(score>=0&&score<=100){if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        }else{
            System.out.println("输入的分数无效");
        }



    }
}
