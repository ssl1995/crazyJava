package java基础.lambda;

public class LambdaQs {
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    public void drive(Flyable f) {
        System.out.println("我正在驾驶:" + f);
        f.fly("晴空如洗的晴日");
    }

    public void test(Addable add) {
        System.out.println("5和3的和为:" + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        // 1.lambda表达式代码块只有一个参数，可以忽略花括号
        lq.eat(() -> System.out.println("苹果的味道真不错"));
        // 2.lambda表达式形参只有一个参数，可以忽略圆括号
        lq.drive(weather -> {
            System.out.println("今天天气是" + weather);
            System.out.println("直升机飞行平稳");
        });
        // 3.lambda表达式代码块只有一条语句，return可以省略
        lq.test((a, b) -> a + b);
        // 3.1 方法引用?
        lq.test(Integer::sum);
    }
}
