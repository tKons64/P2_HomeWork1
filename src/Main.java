public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание №1");

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

        System.out.println(maksim.toString());
        System.out.println(any.toString());
        System.out.println(katy.toString());
        System.out.println(artem.toString());



    }

}