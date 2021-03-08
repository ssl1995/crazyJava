package java基础.对象.多态;

public class Son extends Father implements IFirst, ISecond {

    public static void main(String[] args) {
        IFirst son = new Son();
        son.method();
    }
}
