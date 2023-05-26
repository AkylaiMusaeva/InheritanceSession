public class Fruits {
    private int weight;
    private int price;

    public Fruits(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public Fruits(){

    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void sells(){
        System.out.println(weight*price);
    }
    @Override
    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                ", price=" + price +
                '}';

    }
}
