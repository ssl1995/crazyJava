package java基础.对象.部门员工管理系统;


public class Worker {
    private String name;
    private String workId;
    private String sex;
    private int age;
    private Department department;
    private Post post;

    public Worker() {
    }

    public Worker(String name, String workId, String sex, int age) {
        this.name = name;
        this.workId = workId;
//        this.sex = sex;
//        this.age = age;
        this.sex = setSex(sex);
        this.age = setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getSex() {
        return sex;
    }

    public String setSex(String sex) {
        if ("男".equals(sex)) {
            return sex;
        } else if ("女".equals(sex)) {
            return sex;
        } else {
            // 性别输入有误，就统一为男
            return "男";
        }
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 18 || age > 65) {
            return age;
        } else {
            // 年纪输入有误，统一为18
            return 18;
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


    public void info() {
        System.out.println(
                "姓名:" + name + "\n" +
                        "工号:" + workId + "\n" +
                        "性别:" + sex + "\n" +
                        "年龄:" + age + "\n" +
                        "部门:" + department.getDepartmentName() + "\n" +
                        "职务:" + post.getPostName() + "\n" +
                        "*************************");
    }
}
