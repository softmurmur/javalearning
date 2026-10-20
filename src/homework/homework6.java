package homework;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int  a = 0;
        float b = 0F;
        double c = 0D;
        String s = "";
        System.out.print("从键盘输入一串字符:");
        s = reader.nextLine();
        System.out.println("你输入的字符串是" + s);
        System.out.print("从键盘输入一个整数:");
        		a = reader.nextInt();		//调用 reader 的 nextInt()方法,并把读入的数据赋值给 a
        System.out.println("你输入的整数是" + a);
        System.out.print("从键盘输入一个单精度浮点数:");
        b = reader.nextFloat();		//调用 reader 的 nextFloat()方法,并把读入的数据赋值给 b

        System.out.println("你输入的单精度浮点数是" + b);
        System.out.print("从键盘输入一个双精度浮点数:");
        c = reader.nextDouble();		//调用 reader 的 nextDouble()方法,并把读入的数据赋值给 c
        System.out.println("你输入的双精度浮点数是" + c);
    }
}
