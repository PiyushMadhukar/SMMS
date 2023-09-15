package school.money.management.system;

import java.util.ArrayList;
import java.util.List;
public class Main {


    public static void main(String[] args) {
        Teacher Reena = new Teacher(1,"Reena",5000);
        Teacher Seema = new Teacher(2,"Seema",7000);
        Teacher Mahima = new Teacher(3,"Mahima",6000);
        Teacher Mahendra = new Teacher(3,"Mahendra",9000);

        List<Teacher> teacherList;
        teacherList = new ArrayList<>();
        teacherList.add(Reena);
        teacherList.add(Seema);
        teacherList.add(Mahima);
        teacherList.add(Mahendra);


        Student Naresh = new Student(1,"Naresh",4);
        Student Kishan = new Student(1,"Kishan",4);
        Student Rishita = new Student(1,"Rishita",4);
        Student Arav = new Student(1,"Arav",4);


        List<Student> studentList = new ArrayList<>();
        studentList.add(Naresh);
        studentList.add(Kishan);
        studentList.add(Rishita);
        studentList.add(Arav);

        School HKHPS=new School(studentList,teacherList);
        Naresh.payfees(4000);
        Arav.payfees(5000);
        System.out.println("hkhps earned Rs"+ HKHPS.getTotal_money_earned());


        System.out.println("----making HKHPS give salary----");
        Reena.receivesalary(Reena.getsalary());
        System.out.println(Naresh);
        System.out.println(Reena);

    }
}
