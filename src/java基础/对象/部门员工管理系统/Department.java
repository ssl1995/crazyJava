package java基础.对象.部门员工管理系统;

public class Department {
    private final static int WORKCOUNT = 20;
    private String departmentId;
    private String departmentName;
    private Worker[] workers;
    private int workerCount;

    /**
     * 添加员工的方法
     *
     * @param worker
     */
    public void addWorker(Worker worker) {
        for (int i = 0; i < this.getWorkers().length; i++) {
            if (this.getWorkers()[i] == null) {
                worker.setDepartment(this);
                this.getWorkers()[i] = worker;
                // 有一个位置为空，员工数量加1
                this.workerCount = i + 1;
                return;
            }
        }
    }

    public Department() {
    }

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }


    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Worker[] getWorkers() {
        if (workers == null) {
            workers = new Worker[WORKCOUNT];
        }
        return workers;
    }

    public void setWorkers(Worker[] workers) {

        this.workers = workers;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount() {
        this.workerCount = workers.length;
    }


    public void info() {
        StringBuilder names = new StringBuilder();
        for (Worker worker : workers) {
            names.append(worker.getName());
        }

        System.out.println(
                "部门编号:" + departmentId + "\n" +
                        "部门名称:" + departmentName + "\n" +
                        "员工数组:" + names + "\n" +
                        "员工人数:" + workerCount);
    }

}
