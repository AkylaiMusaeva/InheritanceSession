import java.time.LocalDate;

public class Student extends Person{
    private String program;
    private LocalDate courseStartDate;
    private double fee;

    public Student(String fullName, char gender, String email, String program, LocalDate courseStartDate, double fee) {
        super(fullName, gender, email);
        this.program = program;
        this.courseStartDate = courseStartDate;
        this.fee = fee;
    }
    public Student (){

    }
    public void setProgram(String program) {
        this.program = program;
    }
    public String getProgram() {
        return program;
    }
    public void setCourseStartDate(LocalDate courseStartDate) {
        this.courseStartDate = courseStartDate;
    }
    public LocalDate getCourseStartDate() {
        return courseStartDate;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public double getFee() {
        return fee;
    }


}
