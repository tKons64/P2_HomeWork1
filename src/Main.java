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

        task1_1();
        task1_2();
        task1_3();
        task2_1();
        task2_2();
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

}