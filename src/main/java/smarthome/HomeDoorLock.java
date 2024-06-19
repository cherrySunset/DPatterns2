package smarthome;

public class HomeDoorLock implements DoorLock, DeviceImplementation {

    @Override
    public void lock() {
        System.out.println("Door is locked.");
    }

    @Override
    public void unlock() {
        System.out.println("Door is unlocked.");
    }

    @Override
    public void operateDevice() {
        lock();
    }
}
