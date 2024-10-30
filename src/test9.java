import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
//分析：
//1.键盘录入女婿的酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();//5
//2.对酒量进行一个判断即可
        if(wine > 2) {
            System.out.println("不错哟，小伙子！");
        }
    }
}
