package variable;

public class variabledemo {
    public static void main(String[] args) {
/*          微信余额：100元
            支付宝余额：10元
            银行卡余额：20元
            请问现在一共有多少钱*/
//        定义一个变量记录微信余额
        int a = 100;
//        定义一个变量记录支付宝余额
        int b = 10;
//        定义一个变量记录银行卡余额
        int c = 20;
//        定义一个变量记录总余额
        int sum = a + b + c;
//        输出总余额
        System.out.println(sum);
        a=a+10;
        a=a-2;
        System.out.println(a);
    }
}
