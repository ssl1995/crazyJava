package java基础.对象.多态;

public class Penguin {
    String name = null;
    int health = 10;
    String sex = null;

    // 构造方法不能有返回值。所以这里执行不了
    public void Penguin() {
        health = 10;
        sex = "雄";
        System.out.println("init:");
    }

    public void print() {
        System.out.println("企鹅的名字是" + name + ",健康值是" + health + ",性别是" + sex + ",");
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.print();
    }
}
