package AnimalWorld.Birds;

import java.util.Arrays;
import java.util.Objects;

public class Flightless extends Bird{

    private String typeMovement;

    private static Flightless[] arrObjects;

    public Flightless(String name, int age, String habitat, String typeMovement) {
        super(name, age, habitat);
        this.typeMovement = СheckStringValueInClass(typeMovement);

        if (arrObjects == null) {
            Flightless.arrObjects = new Flightless[1];
            arrObjects[0] = this;
        } else {
            newObjectUnique(this);
        }
    }

    void newObjectUnique(Flightless newObject) {
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
        Flightless that = (Flightless) o;
        return super.equals(o) && Objects.equals(typeMovement, that.typeMovement);
    }

    public void eat() {
        System.out.println("Я - " + getName() + ", я ем рыбу");
    }

    @Override
    public void go() {
        System.out.println("Я - " + getName() + ", я побежал");
    }

    public void walk() {
        System.out.println("Я буду гулять!");
    }

    public String toString() {
        return super.toString() +
                ", способ передвежения: " + getTypeMovement();
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }

    public static Flightless[] getArrObjects() {
        return arrObjects;
    }

}
