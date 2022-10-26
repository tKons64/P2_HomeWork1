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

        //Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default
        if (brand == null || brand == "") {
            this.brand = "default";
        }
        if (model == null || model == "") {
            this.model = "default";
        }
        if (productionCountry == null || productionCountry == "") {
            this.productionCountry = "default";
        }
        //Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        }
        //Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
        if (color == null || color == "") {
            this.color = "белый";
        }
        //Если год производства ≤0, то значение по умолчанию — 2000.
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
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
