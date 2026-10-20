package variable;

public class variabledemo5 {
    public static void main(String[] args) {
//        标准BMI的范围为18.5-23.9
//        BMI=体重/身高^2，体重单位公斤，身高单位米
//        计算以我当前的身高，最多是多少千克
//        定义一个变量记录我的身高
        double height = 1.63;
        double maxWeight = 23.9 * height * height;
        System.out.println("我的最大体重是：" + maxWeight);
    }
}
