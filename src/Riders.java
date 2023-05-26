public class Riders extends Spartans {
    private String clothes;
    private String rideAnimal;

    public Riders(String name, int count, String clothes, String rideAnimal) {
        super(name, count);
        this.clothes = clothes;
        this.rideAnimal = rideAnimal;
    }
    public Riders(){
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
    public String getClothes() {
        return clothes;
    }

    public void setRideAnimal(String rideAnimal) {
        this.rideAnimal = rideAnimal;
    }
    public String getRideAnimal() {
        return rideAnimal;
    }
    public void riding(){
        System.out.println(getName()+" ride "+rideAnimal);
    }
    public void wearing(){
        System.out.println(getName()+" wearing their heavy "+clothes);
    }

    @Override
    public String toString() {
        return "Riders{" +
                "name='" + getName() + '\'' +
                "clothes='" + clothes + '\'' +
                ", rideAnimal='" + rideAnimal + '\'' +
                '}';
    }
}

