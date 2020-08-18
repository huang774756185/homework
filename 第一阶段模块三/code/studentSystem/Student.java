package studentSystem;

public class Student {
    private String num;
    private String name;
    private Integer age;
    public Student(){}

    public Student(String num, String name, Integer age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "学号："+this.getNum()+",姓名："+this.getName()+",年龄："+this.getAge();
    }
    // 修改
    public void update(String num, String name, Integer age){
        this.setNum(num);
        this.setName(name);
        this.setAge(age);
    }
}
