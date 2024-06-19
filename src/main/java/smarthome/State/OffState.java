package smarthome.State;

public class OffState implements DeviceState {

    @Override
    public void handle() {

        System.out.println("Device is in OFF state.");
    }
}
