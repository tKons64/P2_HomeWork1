package transport;

public class Train extends Transport{

    private int costTravel;
    private int timeTravel;
    private String departureStation;
    private String destinationStation;
    private int numberOfWagons;

    public Train(String brand, String model, long productionYear, String productionCountry, String color, int maxSpeed, int costTravel, int timeTravel, String departureStation, String destinationStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.costTravel = costTravel;
        this.timeTravel = timeTravel;
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill() {
        System.out.println("Заправлять только дизелем");
    }

    @Override
    public String toString() {
        return "Поезд - " + this.getBrand() +
                ", модель " + this.getModel() +
                ", год выпуска - " + this.getProductionYear() + " в " + this.getProductionCountry() +
                ", скорость передвижения - " + this.getMaxSpeed() + " км/ч" +
                ", отходит от станции - " + departureStation +
                " и следует до станции  - " + destinationStation +
                ". Цена поездки - " + costTravel + " руб." +
                ", вагонов в поезде - " + numberOfWagons;
    }

    public int getCostTravel() {
        return costTravel;
    }

    public void setCostTravel(int costTravel) {
        this.costTravel = costTravel;
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = timeTravel;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}
