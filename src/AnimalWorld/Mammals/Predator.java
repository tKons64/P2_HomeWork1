package AnimalWorld.Mammals;

import java.util.Arrays;
import java.util.Objects;

public class Predator extends Mammal{
    private String typeFood;

    private static Predator[] arrObjects;

    public Predator(String name, int age, String habitat, int speedMovement, String typeFood) {
        super(name, age, habitat, speedMovement);
        this.typeFood = СheckStringValueInClass(typeFood);

        if (arrObjects == null) {
            Predator.arrObjects = new Predator[1];
            arrObjects[0] = this;
        } else {
            newObjectUnique(this);
        }

    }

    void newObjectUnique(Predator newObject) {
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
        Predator predator = (Predator) o;
        return super.equals(o) && Objects.equals(typeFood, predator.typeFood);
    }

    @Override
    public void eat() {
        System.out.println("Я - " + getName() + ", я ем - " + getTypeFood());
    }

    public void go() {
        System.out.println("Я - " + getName() + ", я бегаю со скоростью - " + getSpeedMovement());
    }

    public void hunt() {
        System.out.println("Я пошел на охоту!" );
    }

    public String toString() {
        return super.toString() +
                ", тип пищи: " + getTypeFood();
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public static Predator[] getArrObjects() {
        return arrObjects;
    }

}
