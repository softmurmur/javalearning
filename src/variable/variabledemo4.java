package variable;

public class variabledemo4 {
    public static void main(String[] args) {
//        BMI=体重/身高^2
//        定义变量记录我的升高，单位为米
        double height = 1.63;
        double weight = 48;
        double bmi = weight / (height * height);
        System.out.println(bmi);
        System.out.println("我的BMI是：" + bmi);
    }
}
