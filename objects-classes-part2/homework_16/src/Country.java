public class Country {
    private final String name;
    private String capitalName;
    private double square;
    private int population;
    private boolean isSea;

    public Country(String name) {
        this.name = name;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSea(boolean sea) {
        isSea = sea;
    }

    public String getName() {
        return name;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public double getSquare() {
        return square;
    }

    public int getPopulation() {
        return population;
    }

    public boolean isSea() {
        return isSea;
    }
}
