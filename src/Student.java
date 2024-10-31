public class Student {
    //成员变量
    private String name;
    private int age;

    public void study() {
        System.out.println("好好学习，天天向上");
    }
    public void doHomework() {
        System.out.println("键盘敲烂，月薪过万");
    }
    //get/set方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
