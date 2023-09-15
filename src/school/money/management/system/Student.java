package school.money.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int total_fees;

    public Student(int i, String kishan, int i1){
        this.id=id;
        this.name =name;
        this.grade=grade;
        this.total_fees=40000;
        this.fees_paid=0;
    }

    public void setgrade(int grade){
        this.grade=grade;
    }

    public void payfees(int fee){
        fees_paid+=fee;
        School.update_Total_money_earned(fees_paid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFees_paid() {
        return fees_paid;
    }

    public int getTotal_fees() {
        return total_fees;
    }

    public int getRemaining_fees(){
        return total_fees-fees_paid;
    }
    @Override
    public String toString() {
        return "student's name: "+name +" fee paid so far: "+ fees_paid;
    }
}

