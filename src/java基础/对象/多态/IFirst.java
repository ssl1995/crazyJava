package java基础.对象.多态;

public interface IFirst {
    default void method(){
        System.out.println("第一个接口");
    }
}
