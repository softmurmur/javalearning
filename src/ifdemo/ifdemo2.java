package ifdemo;

import com.sun.management.HotSpotDiagnosticMXBean;

import java.util.Scanner;

public class ifdemo2 {
    public static void main(String[] args) {
//        定义一个变量表示游戏人物的初始生命值
        int lifeValue = 200;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入游戏人物受到的伤害值：");
        int damageValue = scanner.nextInt();
        lifeValue -= damageValue;
        if(lifeValue <=0){
            lifeValue = 1;
        }

        System.out.println("游戏人物当前的生命值为：" + lifeValue);
        System.out.println("请输入游戏人物恢复的生命值：");
        int newLifeValue = scanner.nextInt();
        lifeValue += newLifeValue;
       if(lifeValue>200){
           lifeValue = 200;
       }

        System.out.println("游戏人物当前的生命值为：" + lifeValue);
    }
}
