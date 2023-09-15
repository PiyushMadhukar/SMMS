package school.money.management.system;

import  java.util.List;

public class School {
    private List<Student> Students;
    private List<Teacher> Teachers;
    private static int Total_money_earned;
    private static int Total_money_spent;


    public School(List<Student> students, List<Teacher> teachers) {
        this.Students = students;
        this.Teachers = teachers;
        Total_money_earned=0;
        Total_money_spent=0;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(Student student) {
        Students.add(student);
    }

    public List<Teacher> getTeachers() {
        return Teachers;
    }

    public void setTeachers( Teacher teacher) {
        Teachers.add(teacher);
    }

    public static void update_Total_money_earned(int money_earned) {
        Total_money_earned+=money_earned;
    }

    public  int getTotal_money_earned() {
        return Total_money_earned;
    }

    public int getTotal_money_spent() {
        return Total_money_spent;
    }

    public static void update_Total_money_spent(int money_spent) {
        Total_money_spent += money_spent;
    }




}
