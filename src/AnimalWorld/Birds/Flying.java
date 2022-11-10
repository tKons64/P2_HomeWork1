package AnimalWorld.Birds;

import java.util.Arrays;
import java.util.Objects;

public class Flying extends Bird{

    private String typeMovement;

    static Flying[] arrObjects;

    public Flying(String name, int age, String habitat, String typeMovement) {
        super(name, age, habitat);
        this.typeMovement = СheckStringValueInClass(typeMovement);

        if (arrObjects == null) {
            Flying.arrObjects = new Flying[1];
            arrObjects[0] = this;
        } else {
            newObjectUnique(this);
        }

    }

    void newObjectUnique(Flying newObject) {
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
        Flying flying = (Flying) o;
        return super.equals(o) && Objects.equals(typeMovement, flying.typeMovement);
    }

    public void eat() {
        System.out.println("Я - " + getName() + ", я ем рыбу");
    }

    @Override
    public void go() {
        System.out.println("Я - " + getName() + ", я полетел!");
    }

    public void fly() {
        System.out.println("Я буду летать!");
    }

    @Override
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

    public static Flying[] getArrObjects() {
        return arrObjects;
    }


}



