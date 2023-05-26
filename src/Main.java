import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**спартанцы деген класс тузунуз,
         анын лучники,рыцари, всадники, философы деген сабкласстары болсун,
         ар кимдин ар кандай 2 ден полялары болсун, жана 2 ден методдору болсун,
         спартанцы классында баары тиешелуу name, count(кол-во) деген полялары анан 1 метод болсун,
         count(кол-во) менен сортировка кылган метод тузунуз*/
       /* Archers archers = new Archers("Армия лучников", 250, "bow and arrow", 2);
        System.out.println(archers);
        archers.competing();
        archers.training();

        System.out.println("---------------------------------------------------");

        Knights knights = new Knights("Армия рыцарей", 120, "protect king", 1918);
        System.out.println(knights);
        knights.fighting();
        knights.protecting();

        System.out.println("---------------------------------------------------");

        Riders riders = new Riders("Армия всадников", 160, "armors", "horses");
        System.out.println(riders);
        riders.riding();
        riders.wearing();

        System.out.println("---------------------------------------------------");

        Philosophers philosophers = new Philosophers("Группа филосовов", 200, "How to become smart", "Italy");
        System.out.println(philosophers);
        philosophers.reading();
        philosophers.teaching();

        System.out.println("---------------------------------------------------");
        System.out.println("Количество людей в армии в порядке возрастания вариант1");
        Spartans spartans = new Spartans();
        int[] count = {archers.getCount(), knights.getCount(), riders.getCount(), philosophers.getCount()};
        System.out.println(Arrays.toString(spartans.sortByCount(count)));

        System.out.println("---------------------------------------------------");
        System.out.println("Количество людей в армии в порядке возрастания вариант2");

        Spartans[] arrayOfSpartans = {archers, knights, riders, philosophers};
        Spartans []sortSpartans=spartans.sortByCount(arrayOfSpartans);
        for (int i = 0; i < arrayOfSpartans.length; i++) {
            System.out.println(sortSpartans[i].getName()+" "+sortSpartans[i].getCount());
        }*/

        /**Country деген класс тузунуз .Анын поляларын бериниз:Аты,калкы,аянты ,тили.
         Маанилерин конструктор аркылуу бериниз. 6 объект тузунуз
         Ошондой эле 3 метод кошунуз.1 метод аянты боюнча эн чон жана эн кичинесин чыгарсын.
         2-метод
         findByCountryName метод болсун
         анан 3-метод findAll.
         Бул программа чексиз иштесин
         */
        Country country1=new Country("Kyrgyzstan",6,198,"kygyz");
        Country country2=new Country("Kazakhstan",8,250,"kazakh");
        Country country3=new Country("Russia",30,600,"russian");
        Country country4=new Country("USA",100,900,"english");
        Country country5=new Country("Germany",46,480,"german");
        Country country6=new Country("Uzbekistan",11,300,"uzbek");
        Country [] countries={country1,country2,country3,country4,country5,country6};
        Scanner scanner=new Scanner(System.in);
        int number=10;
        System.out.println("""
                press 1 to get minimum and maximum
                press 2 to get a country by name
                press 3 to get all countries
                """);
        while(number!=0){
            number= scanner.nextInt();
            switch(number) {
                case 1-> Country.getMaxAndMinArea(countries);
                case 2-> Country.findByCountryName(countries);
                case 3-> Country.findAll(countries);
            }
        }

        /**Apple Pear Apricot*/
        /*Fruits fruits=new Fruits(3,100);
        Apple apple=new Apple(3,50);
        System.out.println(apple);
        apple.sells();
        System.out.println();
        Pear pear=new Pear(1,100);
        System.out.println(pear);
        pear.sells();
        System.out.println();
        Apricot apricot=new Apricot(2,200);
        System.out.println(apricot);
        apricot.sells();*/

        /**Person,Staff,Student*/
       /* Student student1=new Student("Asan",'M',"asan@gmail.com","java",LocalDate.of(2023, 3,4),14);
        Student student2=new Student("Nazik",'F',"nazik@gmail.com","java",LocalDate.of(2023, 3,5),14);
        Student student3=new Student("Almaz",'M',"almaz@gmail.com","js",LocalDate.of(2023, 4,12),16);
        Student student4=new Student("Anara",'F',"anara@gmail.com","js",LocalDate.of(2023, 4,11),16);
        Student student5=new Student("Temir",'M',"temir@gmail.com","english",LocalDate.of(2023, 12,10),11);
        Student student6=new Student("Kanyshai",'F',"kanyshai@gmail.com","english",LocalDate.of(2023, 12,4),11);

        Staff staff=new Staff("ALina",'F',"alina@gmail.com","Peaksoft",12,)*/




















    }
}