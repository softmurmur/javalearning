package operator;

import java.util.Scanner;

public class opetaterdemo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        Boolean result=a%3==0;
//                输出结果
        System.out.println(result);

    }
}
