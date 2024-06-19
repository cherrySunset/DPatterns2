package smarthome;

public class HomeLight implements Light, DeviceImplementation {

    @Override
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off.");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Light brightness set to " + level + ".");
    }

    @Override
    public void operateDevice() {
        turnOn();
    }
}
