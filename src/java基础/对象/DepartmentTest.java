package java基础.对象;

public class DepartmentTest {
    public static void main(String[] args) {
        Post post1 = new Post("P001", "经理");
        Post post2 = new Post("P002", "助理");
        Post post3 = new Post("P002", "职员");

        Department department1 = new Department("D001", "人事部");
        Department department2 = new Department("D002", "市场部");

        Worker worker1 = new Worker("张铭", "S001", "男", 29);
        worker1.setDepartment(department1);
        worker1.setPost(post1);

        Worker worker2 = new Worker("李艾爱", "S002", "女", 21);
        worker2.setDepartment(department1);
        worker2.setPost(post2);

        Worker worker3 = new Worker("孙超", "S003", "男", 29);
        worker3.setDepartment(department1);
        worker3.setPost(post3);

        Worker worker4 = new Worker("张美美", "S004", "女", 26);
        worker4.setDepartment(department2);
        worker4.setPost(post3);

        Worker worker5 = new Worker("蓝迪", "S005", "男", 37);
        worker5.setDepartment(department2);
        worker5.setPost(post1);

        Worker worker6 = new Worker("米莉", "S006", "女", 24);
        worker6.setDepartment(department2);
        worker6.setPost(post3);

        Worker[] workers1 = {worker1, worker2, worker3};
        Worker[] workers2 = {worker3, worker4, worker5};

        department1.setWorkers(workers1);
        department1.setWorkerCount();

        department2.setWorkers(workers2);
        department2.setWorkerCount();

        worker1.info();
        worker2.info();
        worker3.info();
        worker4.info();
        worker5.info();

    }
}
