package AnimalWorld.Amphibians;

import AnimalWorld.Animal;
import AnimalWorld.Mammals.Herbivorous;
import AnimalWorld.Mammals.Predator;

import java.util.Arrays;
import java.util.Objects;

public class Amphibious extends Animal {

    private String habitat;

    private static Amphibious[] arrObjects;

    public Amphibious(String name, int age, String habitat) {
        super(name, age);
        this.habitat = СheckStringValueInClass(habitat);

        if (arrObjects == null) {
            Amphibious.arrObjects = new Amphibious[1];
            arrObjects[0] = this;
        } else {
            newObjectUnique(this);
        }
    }

    void newObjectUnique(Amphibious newObject) {
        for (int i = 0; i < arrObjects.length; i++) {
            if (arrObjects[i].equals(newObject)) {
                throw new IllegalArgumentException("Ошибка программы - новый элемент *" + newObject.getName() + "* не уникален в рамках класса!");
            }
        }
        arrObjects = Arrays.copyOf(arrObjects, arrObjects.length + 1);
        arrObjects[arrObjects.length - 1] = newObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibious that = (Amphibious) o;
        return super.equals(o) && Objects.equals(habitat, that.habitat);
    }

    public void eat() {
        System.out.println("Я - " + getName() + ", я ем насекомых или рыб");
    }

    @Override
    public void go() {
        System.out.println("Я - " + getName() + ", я плаваю или пользаю");
    }

    public void hunt() {
        System.out.println("Я поплыл на охоту!" );
    }

    public String toString() {
        return super.toString() +
                ", среда обитания: " + getHabitat();
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public static Amphibious[] getArrObjects() {
        return arrObjects;
    }

}
