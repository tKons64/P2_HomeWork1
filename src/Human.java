public class Human {

    long yearOfBirth;
    private String name;
    String town;
    String jobTitle;

    Human(String name) {
        this.name = name;
    }

    Human(String name, long yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;

        if (name == null || name == "") {
            this.name = "Информация не указана";
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
        }

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
