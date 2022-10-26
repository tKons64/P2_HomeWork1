public class Main {

    static Human[] arrHumans;

    public static void main(String[] args) {

        arrHumans = new Human[4];

            Human maksim = new Human("Максим");
            maksim.yearOfBirth = 1988;
            maksim.town = "Минск";

        Human any = new Human("Аня");
        any.yearOfBirth = 1993;
        any.town = "Москва";

        Human katy = new Human("Катя");
        katy.yearOfBirth = 1992;
        katy.town = "Калининград";

        Human artem = new Human("Артем");
        artem.yearOfBirth = 1995;
        artem.town = "Москва";

        arrHumans[0] = maksim;
        arrHumans[1] = any;
        arrHumans[2] = katy;
        arrHumans[3] = artem;

        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание №1");

        for (int i = 0; i < arrHumans.length; i++) {
            System.out.println(arrHumans[i].toStringTask1());
        }

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");

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

    public static void task3() {
        System.out.println();
        System.out.println("Задание №3");

        Car lada = new Car("Lada");
        lada.model = "Granta";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";
        lada.color = "желтый";
        lada.engineVolume = 1.7f;

        Car audi = new Car("Audi");
        audi.model = "A8 50 L TDI quattro";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        audi.color = "черный";
        audi.engineVolume = 3.0f;

        Car bmw = new Car("BMW");
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        bmw.color = "черный";
        bmw.engineVolume = 3.0f;

        Car kia = new Car("Kia");
        kia.model = "Sportage 4-го поколения";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        kia.color = "красный";
        kia.engineVolume = 2.4f;

        Car hyundai  = new Car("Hyundai");
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        hyundai.color = "оранжевый";
        hyundai.engineVolume = 1.6f;

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

    }

}