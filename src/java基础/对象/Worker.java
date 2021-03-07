package java基础.对象;


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
        this.sex = sex;
        this.age = age;
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

    public void setSex(String sex) {
        if ("男".equals(sex)) {
            this.sex = sex;
        } else if ("女".equals(sex)) {
            this.sex = sex;
        } else {
            this.sex = "男";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            this.age = 18;
        } else {
            this.age = age;
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
