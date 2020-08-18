package studentSystem;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用学生管理系统！");
        System.out.println("1：增加，2：修改，3：查询一个，4：删除，5：查看全部,q:退出");
        StudentSystem studentSystem=new StudentSystem();
        String num;// 学生号
        String name;// 学生姓名
        Integer age; // 学生年龄
        char command; // 操作指令
        boolean isExit=true; // 退出操作系统标识
        while (isExit){
            System.out.print("请输入操作指令：");
            command=sc.next().charAt(0);
            switch (command){
                case '1':
                    System.out.println("请输入学号、姓名及年龄：");
                    num=sc.next();
                    name=sc.next();
                    age=sc.nextInt();
                    Student student=new Student(num,name,age);
                    studentSystem.add(student);
                    break;
                case '2':
                    System.out.println("请输入需要修改的学生学号：");
                    num=sc.next();
                    Student s1=studentSystem.find(num);
                    System.out.println("请输入修改后学生学号、姓名、年龄");
                    num=sc.next();
                    name=sc.next();
                    age=sc.nextInt();
                    s1.update(num, name, age);
                    System.out.println("修改成功！");
                    break;
                case '3':
                    System.out.println("请输入需要查询的学生号：");
                    num=sc.next();
                    Student s2=studentSystem.find(num);
                    System.out.println(s2);
                    break;
                case '4':
                    System.out.println("请输入需要删除的学生号：");
                    num=sc.next();
                    if(studentSystem.delete(num)){
                        System.out.println("删除成功！");
                        studentSystem.showAll();// 删除后显示全部学生
                    }else {
                        System.out.println("不存在该学生！");
                    }
                    break;
                case '5':

                    studentSystem.showAll();
                    break;

                case 'q':
                    isExit=false;
                    break;
                default:
                    System.out.println("请输入正确指令！");
                    System.out.println("1：增加，2：修改，3：查询一个，4：删除，5：查看全部,q:退出");
                    break;
            }


        }

    }
}
