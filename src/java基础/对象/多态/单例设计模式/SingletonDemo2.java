package java基础.对象.多态.单例设计模式;

public class SingletonDemo2 {

    // 懒汉式:成员属性创建时直接实例化
    private static SingletonDemo2 singletonDemo2;


    // 构造器私有化
    private SingletonDemo2() {

    }

    // 静态方法返回实例
    public static SingletonDemo2 getInstance() {
        if (singletonDemo2 == null) {
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }


}
