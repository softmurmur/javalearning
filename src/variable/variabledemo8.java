package variable;

import java.util.Scanner;

public class variabledemo8 {
    public static void main(String[] args) {
//        BMI=体重/身高^2
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double height = scanner.nextDouble();
        System.out.println("请输入你的体重：");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("你的BMI指数为：" + bmi);
    }
}
