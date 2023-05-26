public class Philosophers extends Spartans{
    private String book;
    private String countryOfBirth;

    public Philosophers(String name, int count, String book, String countryOfBirth) {
        super(name, count);
        this.book = book;
        this.countryOfBirth = countryOfBirth;
    }
    public Philosophers(){

    }
    public void setBook(String book) {
        this.book = book;
    }
    public String getBook() {
        return book;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }
    public String getCountryOfBirth() {
        return countryOfBirth;
    }
    public void reading(){
        System.out.println(getName()+" read so many books");
    }
    public void teaching(){
        System.out.println(getName()+" teach people in home country "+countryOfBirth);
    }

    @Override
    public String toString() {
        return "Philosophers{" +
                "name='" + getName() + '\'' +
                "book='" + book + '\'' +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                '}';
    }
}
