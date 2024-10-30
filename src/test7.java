/**
 * 需求：
 *  一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm。
 *  请用程序实现获取这三个和尚的最高身高。
 * */

public class test7 {
    public static void main(String[] args) {
        // 记录身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        // 先求出其中两个的较大值
        int temp = height1 > height2 ? height1 : height2;

        // 再求出其中较大值和第三个和尚的较大值
        int max = temp > height3? temp : height3;

        System.out.println(max);
    }
}
