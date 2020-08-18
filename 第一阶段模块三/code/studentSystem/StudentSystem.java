package studentSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentSystem {


    public List<Student> students =new ArrayList<Student>();

    // 增
    public void add(Student student){
        this.students.add(student);
    }
    // 删
    public boolean delete(String num){
        // 根据学号删除，如果学号不存在，则返回false
        boolean flag=false;
        for (Student s:students
             ) {
            if(s.getNum().equals(num)){
                students.remove(s);
                flag=true;
                break;
            }
        }
        return flag;
    }
    // 查
    public Student find(String num){
        for (Student s:students
             ) {
            if(s.getNum().equals(num)){
                return s;
            }
        }
        return null;
    }
    // 显示全部
    public void showAll(){
        if(this.students.size()==0){
            System.out.println("目前无学生，请添加！");
            return;
        }
        for (Student s:students
             ) {
            System.out.println(s);
        }
    }

}
