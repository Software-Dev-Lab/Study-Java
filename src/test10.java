import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的名次");
        int rank = sc.nextInt();
        if(rank > 1) {
            System.out.println("恭喜你，你没有中奖");
        } else {
            System.out.println("恭喜你，你中奖了");
        }
    }
}
