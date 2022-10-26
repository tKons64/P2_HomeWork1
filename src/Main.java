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

}