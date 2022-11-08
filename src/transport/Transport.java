package transport;

public class Transport {

    private String brand;
    private String model;
    private long productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, long productionYear, String productionCountry, String color, int maxSpeed) {
        this.setBrand(brand);
        this.setModel(model);

        this.productionYear = productionYear;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (parameterIsNotCorrect(productionCountry)) {
            this.productionCountry = "default";
        }

        this.setColor(color);
        this.setMaxSpeed(maxSpeed);
    }

    boolean parameterIsNotCorrect(String parametr) {
        return (parametr == null || parametr.isEmpty());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if (parameterIsNotCorrect(brand)) {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        if (parameterIsNotCorrect(model)) {
            this.model = "default";
        }
    }

    public long getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (parameterIsNotCorrect(color)) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }
}
