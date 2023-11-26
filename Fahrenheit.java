public class Fahrenheit implements TemperatureUnit{
    private double temp;

    // Constructor for Fahrenheit class
    public Fahrenheit(double temp) {
        this.temp = temp;
    }

    // Implementing TemperatureUnit interface methods
    @Override
    public double toCelsius() {
        return (temp - 32) * (5.0 / 9.0);
    }

    @Override
    public double toFahrenheit() {
        return temp;
    }

    @Override
    public double toKelvin() {
        return (temp + 459.67) * (5.0 / 9.0);
    }
}