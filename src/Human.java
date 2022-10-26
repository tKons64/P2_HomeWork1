public class Human {

    long yearOfBirth;
    private String name;
    String town;
    String jobTitle;

    Human(String name) {
        this.name = name;
    }

    public String toStringTask1() {
        return "Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. " +
                "Будем знакомы!";
    }

    public String toStringTask2() {
        return "Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. " +
                "Я работаю на должности " + jobTitle + ". " +
                "Будем знакомы!";
    }
}
