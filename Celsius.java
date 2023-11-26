public class Celsius implements TemperatureUnit{
    private double temp;

    // Constructor for Celsius class
    public Celsius(double temp) {
        this.temp = temp;
    }

    // Implementing TemperatureUnit interface methods
    @Override
    public double toCelsius() {
        return temp;
    }

    @Override
    public double toFahrenheit() {
        return (9.0 / 5 * temp) + 32;
    }

    @Override
    public double toKelvin() {
        return temp + 273.15;
    }
}