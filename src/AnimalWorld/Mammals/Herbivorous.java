package AnimalWorld.Mammals;

import java.util.Arrays;
import java.util.Objects;

public class Herbivorous extends Mammal{
    private String typeFood;

    private static Herbivorous[] arrObjects;

    public Herbivorous(String name, int age, String habitat, int speedMovement, String typeFood) {
        super(name, age, habitat, speedMovement);
        this.typeFood = СheckStringValueInClass(typeFood);

        if (arrObjects == null) {
            Herbivorous.arrObjects = new Herbivorous[1];
            arrObjects[0] = this;
        } else {
            newObjectUnique(this);
        }
    }

    void newObjectUnique(Herbivorous newObject) {
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
        Herbivorous herbivorous = (Herbivorous) o;
        return Objects.equals(typeFood, herbivorous.typeFood);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", тип пищи: " + getTypeFood();
    }

    @Override
    public void eat() {
        System.out.println("Я - " + getName() + ", я ем - " + getTypeFood());
    }

    @Override
    public void go() {
        System.out.println("Я - " + getName() + ", я бегаю со скоростью - " + getSpeedMovement());
    }

    public Herbivorous(String name, int age, String habitat, int speedMovement) {
        super(name, age, habitat, speedMovement);
    }

    public void graze() {
        System.out.println("Я буду пастись!");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public static Herbivorous[] getArrObjects() {
        return arrObjects;
    }

 }
