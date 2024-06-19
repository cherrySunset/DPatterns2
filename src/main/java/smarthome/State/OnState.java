package smarthome.State;

public class OnState implements DeviceState {

    @Override
    public void handle() {
        System.out.println("Device is in ON state.");
    }
}
