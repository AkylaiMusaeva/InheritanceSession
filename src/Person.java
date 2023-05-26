public class Person {
    private String fullName;
    private char gender;
    private String email;
    public Person(String fullName,char gender,String email){
        this.fullName=fullName;
        this.gender=gender;
        this.email=email;
    }
    public Person (){
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void timeTable(){


    }


}
