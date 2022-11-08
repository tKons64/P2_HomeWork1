import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {

    static Human[] arrHumans;

    public static void main(String[] args) {

        arrHumans = new Human[4];

        Human maksim = new Human("Максим");
        maksim.setYearOfBirth(1988);
        maksim.setTown("Минск");

        Human any = new Human("Аня");
        any.setYearOfBirth(1993);
        any.setTown("Москва");

        Human katy = new Human("Катя");
        katy.setYearOfBirth(1992);
        katy.setTown("Калининград");

        Human artem = new Human("Артем");
        artem.setYearOfBirth(1995);
        artem.setTown("Москва");

        arrHumans[0] = maksim;
        arrHumans[1] = any;
        arrHumans[2] = katy;
        arrHumans[3] = artem;

        //task1_1();
        //task1_2();
        //task1_3();
        //task2_1();
        //task2_2();
        //task3_1();
        //task3_2();

        //task4_1();
        //task4_2();
        //task4_2add();

        //task4_3();
        //task4_5();

        task5_2();
        task5_3();
    }

    public static void task1_1() {
        System.out.println();
        System.out.println("Задание №1.1");

        for (int i = 0; i < arrHumans.length; i++) {
            System.out.println(arrHumans[i].toStringTask1());
        }
    }

    public static void task1_2() {
        System.out.println();
        System.out.println("Задание №1.2");

        Human maksim = arrHumans[0];
        Human any = arrHumans[1];
        Human katy = arrHumans[2];
        Human artem = arrHumans[3];

        maksim.jobTitle = "бренд-менеджер";
        any.jobTitle = "методист образовательных программ";
        katy.jobTitle = "продакт-менеджером";
        artem.jobTitle = "директор по развитию бизнеса";

        // так мы имееем только ссылку на объект класс, то изменив объект мы изменили ег ои в массиве
        for (int i = 0; i < arrHumans.length; i++) {
            System.out.println(arrHumans[i].toStringTask2());
        }

    }

    public static void task1_3() {
        System.out.println();
        System.out.println("Задание №1.3");

        Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7f) ;
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0f) ;
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f) ;
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4f) ;
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f) ;

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }

    public static void task2_1() {
        System.out.println();
        System.out.println("Задание №2.1");

        Human maksim = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human any = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katy = new Human("Катя", 1992, "Калининград", "продакт-менеджером");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(maksim.toStringTask2());
        System.out.println(any.toStringTask2());
        System.out.println(katy.toStringTask2());
        System.out.println(artem.toStringTask2());
    }

    public static void task2_2() {
        System.out.println();
        System.out.println("Задание №2.2");

        Car lada = new Car("Lada", "Granta", 2015, "Россия", "черный", 1.7f);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0f);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4f);
        Car hyundai  = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

    }

    public static void task3_1() {
        System.out.println();
        System.out.println("Задание №3.1");

        Human maksim = new Human("Максим", -1988, "", null);
        System.out.println(maksim.toStringTask2());

    }

    public static void task3_2() {
        System.out.println();
        System.out.println("Задание №3.2");

        Car lada = new Car("Lada", null, 0, "", "", 0);

        System.out.println(lada.toString());
    }

    public static void task4_1() {
        System.out.println();
        System.out.println("Задание №4.1");

        Human vladimir = new Human("Владимир", "Казань", "", (byte) 21);

        System.out.println(vladimir.toStringTask2());
    }

    public static void task4_2() {
        System.out.println();
        System.out.println("Задание №4.2");

        Flower rose = new Flower("Роза обыкновенная", null , "Голландия", 35.59f, 0);
        Flower сhrysanthemum = new Flower("Хризантема", null , "", 15f, 5);
        Flower pion = new Flower("Пион", null , "Англия", 69.9f, 1);
        Flower gypsophila = new Flower("Гипсофила", null , "Турция", 19.5f, 10);

        System.out.println(rose.toString());
        System.out.println(сhrysanthemum.toString());
        System.out.println(pion.toString());
        System.out.println(gypsophila.toString());
    }

    public static void task4_2add() {
        System.out.println();
        System.out.println("Задание №4.2 доп. задание");

        Flower rose = new Flower("Роза обыкновенная", null , "Голландия", 35.59f, 0);
        Flower сhrysanthemum = new Flower("Хризантема", null , "", 15f, 5);
        Flower gypsophila = new Flower("Гипсофила", null , "Турция", 19.5f, 10);

        Flower[] arrFlowers = new Flower[3];
        long[] arrPieces = new long[3];
        arrFlowers[0] = rose;
        arrPieces[0] = 5;
        arrFlowers[1] = сhrysanthemum;
        arrPieces[1] = 11;
        arrFlowers[2] = gypsophila;
        arrPieces[2] = 3;

        calculateBouquet(arrFlowers, arrPieces);

    }

    public static void calculateBouquet(Flower[] arrFlowers, long[] arrPieces){
        float bouquetCost = 0f;
        long bouquetlifeSpan = 0;
        String outputMessage = "";

        if (arrFlowers.length != arrPieces.length){
            System.out.println("Данные заполненны не верно, рассчитать букет не возможно!");
            return;
        }

        for (int i = 0; i < arrFlowers.length; i++) {
            bouquetCost = bouquetCost + (arrFlowers[i].getCost() * arrPieces[i]);
            if (i == 0) {
                bouquetlifeSpan = arrFlowers[i].getLifeSpan();
            } else if (bouquetlifeSpan > arrFlowers[i].getLifeSpan()) {
                bouquetlifeSpan = arrFlowers[i].getLifeSpan();
            }
            outputMessage = outputMessage + arrFlowers[i].getTitle() + " - " + arrPieces[i] + " шт., ";
        }

        bouquetCost = bouquetCost * 1.1f;

        System.out.println("Букет: " + outputMessage + "общая стоимость - " + bouquetCost + " руб., срок стояния - " + bouquetlifeSpan + " дней");

    }

    public static void task4_3() {
        System.out.println();
        System.out.println("Задание №4.3");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0f) ;

        System.out.println(audi.toString());

        audi.changeTires();
        audi.setRegistrationNumber("3345178");

        audi.setRegistrationNumber("у456вр178");

        System.out.println(audi.toString());
    }

    public static void task4_5() {
        System.out.println();
        System.out.println("ООП ч.2. Домашнее задание №3, задание №2");

        Car lada = new Car("Lada", "Granta", 2015, "Россия", "черный", 1.7f);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0f);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4f);
        Car hyundai  = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);

        System.out.println(lada.toString());

        Car.Key standartKey = new Car.Key();
        Car.Key remoteStart = new Car.Key(true, true);

        lada.setKey(standartKey);
        audi.setKey(remoteStart);
        bmw.setKey(remoteStart);
        kia.setKey(standartKey);
        hyundai.setKey(standartKey);

        System.out.println(lada.getKey().toString());

        Car.Insurance ladaInsurance = lada.new Insurance(LocalDate.of(2023, 01, 31), 25000, "1325954BF");
        lada.setInsurance(ladaInsurance);
        Car.Insurance audiInsurance = lada.new Insurance(LocalDate.of(2023, 12, 31), 80000, "985аа5658");
        audi.setInsurance(audiInsurance);
        Car.Insurance bmwInsurance = lada.new Insurance(LocalDate.of(2023, 01, 31), 70000, "6546813554");
        bmw.setInsurance(bmwInsurance);
        Car.Insurance kiaInsurance = lada.new Insurance(LocalDate.of(2023, 06, 30), 40000, "695563545");
        kia.setInsurance(kiaInsurance);
        Car.Insurance hyundaiInsurance = lada.new Insurance(LocalDate.of(2024, 03, 31), 35000, "");
        hyundai.setInsurance(hyundaiInsurance);


    }

    public static void task5_2() {
        System.out.println();
        System.out.println("ООП ч.3. Домашнее задание №1, задание №2");

        Train lastochka = new Train("Ласточка",
                "B-901",
                2011,
                "Россия",
                "",
                301,
                3500,
                0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);

        Train Leningrad = new Train("Ленинград",
                "D-125",
                2019,
                "Россия",
                "",
                270,
                1700,
                0,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8);

        System.out.println(lastochka.toString());
        System.out.println(Leningrad.toString());
    }

    public static void task5_3() {
        System.out.println();
        System.out.println("ООП ч.3. Домашнее задание №1, задание №3");

        Bus ikarus = new Bus("Ика́рус",
                "250",
                1980,
                "Венгрия",
                "красный",
                120);

        Bus liaz = new Bus("ЛиАЗ",
                "677",
                1979,
                "Россия",
                "желтый",
                70);

        Bus laz = new Bus("ЛАЗ",
                "695",
                1985,
                "Украина",
                "бело-голубой",
                86);

        System.out.println(ikarus.toString());
        System.out.println(liaz.toString());
        System.out.println(laz.toString());

    }

}