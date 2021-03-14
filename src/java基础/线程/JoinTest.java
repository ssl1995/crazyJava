package java基础.线程;

public class JoinTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "执行了");
            }
        });
        thread.start();
        try {
            // 抢占资源：执行了join的线程必须执行完，其他线程才能执行
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // thread线程执行完了，main才会执行
        System.out.println("main线程执行了");
    }
}
