import java.util.PrimitiveIterator;
public class Staff extends Person {
    private String school;
    private double salary;
    private Student[]students;

    public Staff(String fullName, char gender, String email, String school, double salary, Student[] students) {
        super(fullName, gender, email);
        this.school = school;
        this.salary = salary;
        this.students = students;
    }
    public Staff(){
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getSchool() {
        return school;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public Student[] getStudents() {
        return students;
    }




}
