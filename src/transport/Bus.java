package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, long productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Бензин, или дизель на заправке");
    }

    @Override
    public String toString() {
        return "Автобус - " + this.getBrand() +
                ", модель " + this.getModel() +
                ", год выпуска - " + this.getProductionYear() + " в " + this.getProductionCountry() +
                ", цвет - " + this.getColor() +
                ", макс. скорость - " + this.getMaxSpeed() + " км/ч";
    }
}

