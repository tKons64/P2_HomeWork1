public class Human {

    long yearOfBirth;
    private String name;
    String town;

    Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. " +
                "Будем знакомы!";
    }
}
