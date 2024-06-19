package smarthome.State;

public class LockedState implements DeviceState {

    @Override
    public void handle() {

        System.out.println("Device is in LOCKED state.");
    }
}
