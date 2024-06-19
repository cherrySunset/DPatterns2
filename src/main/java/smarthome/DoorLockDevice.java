package smarthome;

public class DoorLockDevice extends Device {
    public DoorLockDevice(DeviceImplementation implementation) {

        super(implementation);
    }

    @Override
    public void operate() {
        implementation.operateDevice();
    }
}
