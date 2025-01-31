public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public double celsiusToFahrenheit(double celsius) {
        return ((celsius * 9 / 5) + 32);
    }
    public boolean isExtremeTemperature(double celsius){
        if(celsius > 50 || celsius < -40)
        {
            return true;
        }
        return false;
    }

}
