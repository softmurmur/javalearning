package homework;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入华氏度：");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(  fahrenheit + "华氏度等于" + celsius + "摄氏度");
    }
}
