package variable;

public class variabledemo2 {
    public static void main(String[] args) {
        /*
我方: 叉子        对方: 长手
攻击: 220        攻击: 210
防御: 85         防御: 80
血量: 1012.5     血量: 1223.3
技能加成: 1.2    技能加成: 1.3

技能造成伤害的公式: 攻击力 * 技能加成 - 对方防御力
普攻造成伤害的公式: 攻击力 - 对方防御力

计算:
我方第一次进行普通攻击, 造成多少伤害, 对方还剩余多少血量?
我方第二次进行技能攻击, 造成多少伤害, 对方还剩余多少血量?

*/
//        定义一个变量记录我方攻击力
        int Attack1   = 220;
//        定义一个变量记录我方防御力
        int Defense1  = 85;
//        定义一个变量记录我方血量
        double Blood1 = 1012.5;
//        定义一个变量记录我方技能加成
        double Skill1 = 1.2;
//        定义一个变量记录对方攻击力
        int Attack2   = 210;
//        定义一个变量记录对方防御力
        int Defense2  = 80;
//        定义一个变量记录对方血量
        double Blood2 = 1223.3;
//        定义一个变量记录对方技能加成
        double Skill2 = 1.3;
//        计算我方第一次普通攻击造成伤害
        double damage1 = Attack1 - Defense2;
//        计算对方剩余血量
        double Blood2_after1 = Blood2 - damage1;
//        输出结果
        System.out.println("我方第一次普通攻击造成伤害:" + damage1 + ", 对方剩余血量:" + Blood2_after1);
//        计算我方第二次技能攻击造成伤害
        double damage2 = Attack1 * Skill1 - Defense2;
//        计算对方剩余血量
        double Blood2_after2 = Blood2_after1 - damage2;
//        输出结果
        System.out.println("我方第二次技能攻击造成伤害:" + damage2 + ", 对方剩余血量:" + Blood2_after2);

    }
}
