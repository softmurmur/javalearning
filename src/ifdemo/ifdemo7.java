package ifdemo;

import java.util.Scanner;

public class ifdemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高（单位米）：");
        double height = scanner.nextDouble();
        System.out.println("请输入你的体重（单位千克）：");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("你的BMI指数是：" + bmi);
        if (bmi < 18.5) {
            System.out.println("身体状态：消瘦 健康风险：部分增加");
        } else if (bmi < 23.9) {
            System.out.println("身体状态：正常 健康风险：正常");
        }else if (bmi>24.0&&bmi < 26.9) {
            System.out.println("身体状态：偏胖 健康风险：增加");
        }else if (bmi>27.0&&bmi < 29.9) {
                    System.out.println("身体状态：肥胖 健康风险：中度增加");
        } else {
            System.out.println("身体状态：严重肥胖 健康风险：严重增加");
        }
    }
}
