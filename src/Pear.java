public class Pear extends Fruits{
    public Pear(int weight, int price) {
        super(weight, price);
    }

    public Pear() {
    }
    @Override
    public String toString() {
        return "Pears{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }
    public void sells(){
        System.out.printf("Цена персиков за %d кг будет стоить ",getWeight());
        super.sells();


    }
}
