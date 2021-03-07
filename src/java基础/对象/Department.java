package java基础.对象;

import java.util.Arrays;

public class Department {
    private String departmentId;
    private String departmentName;
    private Worker[] workers;
    private int workerCount;

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
