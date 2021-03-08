package java基础.对象.多态;

public interface ISecond {
    default void method(){
        System.out.println("第二个接口");
    }
}
