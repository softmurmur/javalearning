package ifdemo;

import java.util.Scanner;

public class ifdemo2 {
    public static void main(String[] args) {
//        定义一个变量表示人物的初始血量
        int bloodVolume = 200;
//        通过键盘输入人物受到的伤害值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入人物受到的伤害值：");
        int damage = scanner.nextInt();
        bloodVolume = bloodVolume - damage;
        if (bloodVolume <= 0) {
            bloodVolume=1;
        }

        System.out.println("人物的当前血量为：" + bloodVolume);
//        通过键盘输入技能增加的恢复值
        System.out.println("请输入技能增加的恢复值：");
        int recovery = scanner.nextInt();
        bloodVolume = bloodVolume + recovery;
        if (bloodVolume > 200) {
            bloodVolume = 200;
        }
        System.out.println("人物的当前血量为：" + bloodVolume);
    }
}
