package smarthome.State;

public class UnlockedState implements DeviceState {

    @Override
    public void handle() {

        System.out.println("Device is in UNLOCKED state.");
    }
}
