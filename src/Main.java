import AnimalWorld.Amphibians.Amphibious;
import AnimalWorld.Birds.Flightless;
import AnimalWorld.Birds.Flying;
import AnimalWorld.Mammals.Herbivorous;
import AnimalWorld.Mammals.Predator;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("=== Класс-Травоядные ===");
        Herbivorous gazelle = new Herbivorous("Газель", 3, "Африка", 50, "растения");
        Herbivorous giraffe = new Herbivorous("Жираф", 10, "Африка", 55, "листья деревьев");
        Herbivorous horse = new Herbivorous("Лощадь", 9, "Европа", 88, "трава");
        //Herbivorous bear2 = new Herbivorous("Медведь", 4, "Россия", 50, "всеядный");
        for (int i = 0; i < Herbivorous.getArrObjects().length; i++) {
            System.out.println(Herbivorous.getArrObjects()[i].toString());
            Herbivorous.getArrObjects()[i].eat();
            Herbivorous.getArrObjects()[i].go();
            Herbivorous.getArrObjects()[i].graze();
        }

        System.out.println("");
        System.out.println("=== Класс-Хищники ===");
        Predator hyena = new Predator("Гиена", 5, "Африка", 64, "падаль");
        Predator tiger = new Predator("Тигр", 3, "Дальний Восток России", 60, "мясо копытных");
        Predator bear = new Predator("Медведь", 4, "Россия", 50, "всеядный");
        //Predator bear2 = new Predator("Медведь", 4, "Россия", 50, "всеядный");
        for (int i = 0; i < Predator.getArrObjects().length; i++) {
            System.out.println(Predator.getArrObjects()[i].toString());
            Predator.getArrObjects()[i].eat();
            Predator.getArrObjects()[i].go();
            Predator.getArrObjects()[i].hunt();
        }

        System.out.println("");
        System.out.println("=== Класс-Земноводные ===");
        Amphibious frog = new Amphibious("Лягушка", 1, "Водоемы");
        Amphibious snakeFreshwater = new Amphibious("Уж пресноводный", 4, "Азия");
        for (int i = 0; i < Amphibious.getArrObjects().length; i++) {
            System.out.println(Amphibious.getArrObjects()[i].toString());
            Amphibious.getArrObjects()[i].eat();
            Amphibious.getArrObjects()[i].go();
            Amphibious.getArrObjects()[i].hunt();
        }

        System.out.println("");
        System.out.println("=== Класс-Нелетающие ===");
        Flightless peacock = new Flightless("Павлин",2,"Непал", "ходит");
        Flightless penguin = new Flightless("Пингвин", 1, "Антарктида", "ходит");
        Flightless dodoBird = new Flightless("Птица додо", 10, "Маврикий", "ходит");
        for (int i = 0; i < Flightless.getArrObjects().length; i++) {
            System.out.println(Flightless.getArrObjects()[i].toString());
            Flightless.getArrObjects()[i].eat();
            Flightless.getArrObjects()[i].go();
            Flightless.getArrObjects()[i].hunt();
        }

        System.out.println("");
        System.out.println("=== Класс-Летающие ===");
        Flying gull = new Flying("Чайка", 5,"Озера ", "летает");
        Flying albatross = new Flying("Альбатрос", 12, "Острова", "летает");
        Flying falcon = new Flying("Сокол", 8, "Почти ввезде", "летает");
        for (int i = 0; i < Flying.getArrObjects().length; i++) {
            System.out.println(Flying.getArrObjects()[i].toString());
            Flying.getArrObjects()[i].eat();
            Flying.getArrObjects()[i].go();
            Flying.getArrObjects()[i].hunt();
        }

    }



}