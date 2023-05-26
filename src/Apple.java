public class Apple extends Fruits{
    public Apple(int weight, int price) {
        super(weight, price);
    }

    public Apple() {
    }

    @Override
    public String toString() {
        return "Apples{" +
                "weight=" + getWeight() +
                ", price=" + getPrice()+
                '}';
    }
    public void sells(){
        System.out.printf("Цена яблок за %d кг будет стоить ",getWeight());
        super.sells();
    }

}
