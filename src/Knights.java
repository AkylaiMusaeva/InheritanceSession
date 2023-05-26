public class Knights extends Spartans {
    private String duties;
    private int become;//год начала борьбы против врагов

    public Knights(String name, int count, String duties, int become) {
        super(name, count);
        this.duties = duties;
        this.become = become;
    }
    public Knights(){
    }
    public void setDuties(String duties) {
        this.duties = duties;
    }
    public String getDuties() {
        return duties;
    }

    public void setBecome(int become) {
        this.become = become;
    }
    public int getBecome() {
        return become;
    }

    public void fighting(){
        System.out.println(getName()+" started to get fighting classes when they were young ");
    }
    public void protecting(){
        System.out.println("their first time fighting against enemies was in "+become);
    }

    @Override
    public String toString() {
        return "Knights{" +
                "name='" + getName() + '\'' +
                "duties='" + duties + '\'' +
                ", become=" + become +
                '}';
    }
}
