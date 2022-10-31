package transport;

public class Car {

    private String brand;
    private String model;
    float engineVolume;
    String color;
    private long productionYear;
    private String productionCountry;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private long numberOfSeats;
    boolean summerTires;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model, long productionYear, String productionCountry, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.setColor(color);
        this.setEngineVolume(engineVolume);

        //Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default
        if (parameterIsNotCorrect(brand)) {
            this.brand = "default";
        }
        if (parameterIsNotCorrect(model)) {
            this.model = "default";
        }
        if (parameterIsNotCorrect(productionCountry)) {
            this.productionCountry = "default";
        }

        //Если год производства ≤0, то значение по умолчанию — 2000.
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }

        this.setTransmission("МКПП");
        this.bodyType = "седан";
        this.setRegistrationNumber("x000xx000");
        this.numberOfSeats = 5;
        this.summerTires = true;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public long getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public long getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        if (isSummerTires()) {
            return "Летняя";
        } else {
            return "Зимняя";
        }
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (parameterIsNotCorrect(color)) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumberCorrect(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println("Рег. номер указан не верно!");
        }
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    boolean parameterIsNotCorrect(String parametr) {
        return (parametr == null || parametr.isEmpty());
    }

    public void changeTires() {
        summerTires = !summerTires;
    }

    boolean registrationNumberCorrect(String regNumber) {
        if (regNumber.length() != 9) {
            return false;
        }

        boolean numberСorrect = true;

        char[] regNumberArr = regNumber.toCharArray();
        for (int i = 0; i < regNumberArr.length; i++) {
            if (i == 0 || i == 4 || i == 5) {
                numberСorrect = Character.isLetter(regNumberArr[i]);
            } else {
                numberСorrect = Character.isDigit(regNumberArr[i]);
            }
            if (!numberСorrect) {
                return false;
            }
        }

        return numberСorrect;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() +
                ", " + getProductionYear() + " года выпуска" +
                ", сборка - " + getProductionCountry() +
                ", " + getColor() + " цвет кузова" +
                ", объем - " + getEngineVolume() + " л." +
                ", коробка передач - " + getTransmission() +
                ", тип кузова - " + getBodyType() +
                ", рег. номер - " + getRegistrationNumber() +
                ", кол. мест - " + getNumberOfSeats() +
                ", резина - " + getTires() + ".";

    }
}
