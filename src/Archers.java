public class Archers extends Spartans{
    private String arsenal;
    private int countOfArsenal;

    public Archers(String name,int count,String arsenal, int countOfArsenal) {
        super(name,count);
        this.arsenal = arsenal;
        this.countOfArsenal = countOfArsenal;
    }
    public Archers(){

    }
    public void setArsenal(String arsenal) {
        this.arsenal = arsenal;
    }
    public String getArsenal() {
        return arsenal;
    }

    public void setCountOfArsenal(int countOfArsenal) {
        this.countOfArsenal = countOfArsenal;
    }
    public int getCountOfArsenal() {
        return countOfArsenal;
    }
    public void competing(){
        System.out.println(getName()+" will be competing in Olympic games next year");
    }
    public void training(){
        System.out.println("So they should train a lot to achieve good result");
    }

    @Override
    public String toString() {
        return "Archers{" +
                "name='" + getName() + '\'' +
                ",arsenal='" + arsenal + '\'' +
                ", countOfArsenal=" + countOfArsenal +
                '}';
    }
}
