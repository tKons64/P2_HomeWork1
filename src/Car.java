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

    Car(String brand, String model, long productionYear, String productionCountry, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;
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
