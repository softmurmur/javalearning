package homework;

public class homework2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int s = 0;
        s = a % b;        //【代码1】a对b求模，赋值给s
        System.out.println("a%b = " + s);
        a++;              //【代码2】a自增
        b--;              //【代码3】b自减

        s = ++a + --b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
    }
}
