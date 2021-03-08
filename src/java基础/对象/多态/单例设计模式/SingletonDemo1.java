package java基础.对象.多态.单例设计模式;

public class SingletonDemo1 {

    // 饿汉式:成员属性创建时直接实例化
    private static SingletonDemo1 singletonDemo1 = new SingletonDemo1();


    // 构造器私有化
    private SingletonDemo1() {

    }

    // 静态方法返回实例
    public static SingletonDemo1 getInstance() {
        return singletonDemo1;
    }


}
