public class SmartWeatherStation extends Robot {
    public SmartWeatherStation () {
        super("Smart Weather Station");
    }
    @Override
    public void sayHello() {
        System.out.println("Hi people! I'm " + getModel());
    }
}
