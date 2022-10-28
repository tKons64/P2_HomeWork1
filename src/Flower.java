public class Flower {

    private String title;
    private String flowerColor;
    private String country;
    private float cost;
    private long lifeSpan;

    Flower(String title, String flowerColor, String country, float cost, long lifeSpan) {
        this.title = title;
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1f;
        } else {
            this.cost = cost;
        }
    }

    public long getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(long lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }


    @Override
    public String toString() {
        return title +
                " из страны - " + country +
                ", цвет - " + flowerColor +
                ", стоимость за штуку - " + cost + " руб." +
                ", срок стояния - " + lifeSpan + " дней";
    }
}
