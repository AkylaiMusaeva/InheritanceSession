import java.util.Arrays;
import java.util.Scanner;
public class Country {
    private String name;
    private int population;//в миллионах
    private int area;
    private String language;
    public Country(String name, int population, int area, String language) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.language = language;
    }
    public Country() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    public static void getMaxAndMinArea(Country[]countries) {
        int max=countries[0].area;
        for(int i= 0; i < countries.length; i++) {
            if (max < countries[i].area) {
                max = countries[i].area;
            }
        }
        Country maxCountryName=countries[0];
        for (int i = 0; i < countries.length;i++) {
            if (max==countries[i].getArea()) {
                maxCountryName=countries[i];
            }
        }

        int min=countries[0].area;
        for(int j= 0; j < countries.length; j++) {
            if (min > countries[j].area) {
                min = countries[j].area;
            }
        }
        Country minCountryName=countries[0];
        for (int i = 0; i < countries.length; i++) {
            if(min==countries[i].getArea()){
                minCountryName=countries[i];
            }
        }
        System.out.println(maxCountryName.getName()+" "+maxCountryName.getArea());
        System.out.println(minCountryName.getName()+" "+minCountryName.getArea());
    }

    public static void findByCountryName(Country[] countries){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a country name ");
        String countryNameFromScanner=scanner.nextLine();
        for (int i = 0; i < countries.length; i++) {
        if(countryNameFromScanner.equalsIgnoreCase(countries[i].name)) {
            System.out.println(countries[i].toString());
        }
        }
    }
    public static void findAll(Country []countries) {
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i].toString());
        }
    }
        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", population=" + population +
                    ", area=" + area +
                    ", language='" + language + '\'' +
                    '}';
        }
    }
