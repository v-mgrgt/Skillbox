public class Country {
    private final String name;
    private int population;
    private double square;
    private String capitalName;
    private boolean isSea;

    public Country(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setSea(boolean sea) {
        isSea = sea;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public boolean isSea() {
        return isSea;
    }
}
