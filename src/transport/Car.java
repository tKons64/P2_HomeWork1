package transport;

import java.time.LocalDate;
import java.util.Date;

public class Car extends Transport{

    public static class Key {

        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key() {
            this.remoteEngineStart = false;
            this.keylessEntry = false;
        }

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "удаленный запуск - " + remoteEngineStart +
                    ", доступ без ключа - " + keylessEntry;
        }
    }

    public class Insurance {
       private LocalDate validity;
       private double Cost;
       private String regNumber;

        public Insurance(LocalDate validity, double cost, String regNumber) {
            this.validity = validity;
            Cost = cost;
            this.regNumber = regNumber;
        }

        public LocalDate getValidity() {
            return validity;
        }

        public double getCost() {
            return Cost;
        }

        public String getRegNumber() {
            return regNumber;
        }
    }

    float engineVolume;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private long numberOfSeats;
    boolean summerTires;

    private Key key;
    private Insurance insurance;

    public Car(String brand) {
        this(brand,
                null,
                0,
                null,
                null,
                0);
    }

    public Car(String brand, String model, long productionYear, String productionCountry, String color, float engineVolume) {
        super(brand, model, productionYear, productionCountry, color, 0);

        this.setEngineVolume(engineVolume);
        this.setTransmission("МКПП");
        this.bodyType = "седан";
        this.setRegistrationNumber("x000xx000");
        this.numberOfSeats = 5;
        this.summerTires = true;
    }

    public float getEngineVolume() {
        return engineVolume;
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

    boolean insuranceIsValid(Insurance insurance, boolean displayMessage) {
        if (insurance.validity.isAfter(LocalDate.now())) {
            return true;
        } else {
            if (displayMessage){
                System.out.println("Страховка просрочена, необходимо оформить новый полис!");
            }
            return false;
        }
    }

    boolean regNumberCorrect(String regNumber) {
        if (regNumber.length() != 9) {
            System.out.println("Номер страховки некорректный!");
            return false;
        } else {
            return true;
        }
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        if (insuranceIsValid(insurance, true) && regNumberCorrect(insurance.regNumber)) {
            this.insurance = insurance;
        } else {
            System.out.println("Страховка для " + this.getBrand() + " не записана!");
        }
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
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
                ", резина - " + getTires();

    }
}
