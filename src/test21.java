import java.util.Random;
import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        //1.生成一个1-100之间的随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;// 0 ~ 99 + 1 --- 1 ~ 100
        System.out.println(number);

//2.使用键盘录入去猜出这个数字是多少？
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数");
            int guessNumber = sc.nextInt();
            //3.比较
            if(guessNumber > number){
                System.out.println("您猜的数字大了");
            }else if(guessNumber < number){
                System.out.println("您猜的数字小了");
            }else{
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}
