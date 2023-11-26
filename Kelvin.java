public class Kelvin implements TemperatureUnit{
   private double temp;

    // Constructor for Kelvin class
    public Kelvin(double temp) {
        this.temp = temp;
    }

    // Implementing TemperatureUnit interface methods
    @Override
    public double toCelsius() {
        return temp - 273.15;
    }

    @Override
    public double toFahrenheit() {
        return (9.0 / 5 * temp) - 459.67;
    }

    @Override
    public double toKelvin() {
        return temp;
    }
}