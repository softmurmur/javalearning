package ifdemo;

import java.util.Scanner;

public class ifdemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        int a = scanner.nextInt();
        if(a>0){
            if(a>60){
                System.out.println("及格");
            }
            else{
                System.out.println("不及格");
            }
        }
        else{
            System.out.println("分数不合理");
        }
    }
}
