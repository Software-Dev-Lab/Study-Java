public class test2 {
    public static void main(String[] args) {
        //就是把10赋值给变量a
        int a = 10;
        System.out.println(a);

        // 如果等号右边需要进行计算
        int b = 20;
        int c = a + b;
        System.out.println(c);

        // 先计算等号右边的，把计算的结果赋值给左边的变量
        a = a + 10;
        System.out.println(a);
    }
}
