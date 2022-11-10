package AnimalWorld.Mammals;

import AnimalWorld.Animal;

import java.util.Objects;

public class Mammal extends Animal {
    private String habitat;
    private int speedMovement;

    public Mammal(String name, int age, String habitat, int speedMovement) {
        super(name, age);
        this.habitat = СheckStringValueInClass(habitat);
        this.speedMovement = speedMovement;
    }

    public void walk() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return super.equals(o) && speedMovement == mammal.speedMovement && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, speedMovement);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", среда обитания: " + habitat +
                ", скорость передвижения: " + speedMovement;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getSpeedMovement() {
        return speedMovement;
    }

    public void setSpeedMovement(int speedMovement) {
        this.speedMovement = speedMovement;
    }
}
