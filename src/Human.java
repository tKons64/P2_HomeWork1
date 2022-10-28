import java.time.LocalDate;

public class Human {

    private long yearOfBirth;
    private String name;
    private String town;
    String jobTitle;

    Human(String name) {
        this.name = name;
    }

    Human(String name, long yearOfBirth, String town, String jobTitle) {
        this.name = name;
        setYearOfBirth(yearOfBirth);
        setTown(town);
        this.jobTitle = jobTitle;

        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        }
    }

    Human(String name, String town, String jobTitl, byte age) {
        this.name = name;
        setYearOfBirth(LocalDate.now().getYear()-age);
        setTown(town);
        this.jobTitle = jobTitle;

        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public long getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(long yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
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
