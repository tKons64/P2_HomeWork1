public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    long productionYear;
    String productionCountry;

    Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand + " " + model +
                ", " + productionYear + " года выпуска" +
                ", сборка - " + productionCountry +
                ", " + color + " цвет кузова" +
                ", объем - " + engineVolume + " л.";
    }
}
