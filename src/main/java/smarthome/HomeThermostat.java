package smarthome;

public class HomeThermostat implements Thermostat, DeviceImplementation {

    @Override
    public void setTemperature(int temperature) {
        System.out.println("Thermostat temperature set to " + temperature + " degrees.");
    }

    @Override
    public void operateDevice() {
        setTemperature(22);
    }
}
