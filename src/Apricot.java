public class Apricot extends Fruits{
    public Apricot(int weight, int price) {
        super(weight, price);
    }

    public Apricot() {
    }
    @Override
    public String toString() {
        return "Apricots{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }
    public void sells(){
        System.out.printf("Цена абрикосов за %d кг будет стоить ",getWeight());
        super.sells();
    }
}
