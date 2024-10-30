import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");

        int number = sc.nextInt();

        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100 % 10;

        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);

        int a = 10;

        a++;//就是让变量a里面的值 + 1
        System.out.println(a);//11
        ++a;//就是让变量a里面的值 + 1
        System.out.println(a);//12
    }
}
