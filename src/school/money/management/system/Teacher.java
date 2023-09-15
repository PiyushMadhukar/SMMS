package school.money.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    private int salaryearned;

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryearned=0;
    }

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public int getsalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receivesalary(int salary){
        salaryearned+=salary;
        School.update_Total_money_spent(salary);
    }

    public String toString() {
        return "Teacher's name: "+name +" salary earned far: "+ salaryearned;
    }


}
