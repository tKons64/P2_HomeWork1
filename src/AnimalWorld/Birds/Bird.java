package AnimalWorld.Birds;

import AnimalWorld.Animal;

import java.util.Objects;

public abstract class Bird extends Animal{

    private String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        this.habitat = СheckStringValueInClass(habitat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return super.equals(o) && Objects.equals(habitat, bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    public void hunt() {
        System.out.println("Я иду охотится!");
    }

}
