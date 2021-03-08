package java基础.对象;

public class Child extends Base {
    void test() {
        System.out.println("Child.test()");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Base baseObj = (Base) child;
        baseObj.test();
    }
}

class Base {
    void test() {
        System.out.println("Base.test()");
    }
}

