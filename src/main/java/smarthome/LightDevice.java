package smarthome;

public class LightDevice extends Device {

    public LightDevice(DeviceImplementation implementation) {
        super(implementation);
    }
    @Override
    public void operate() {
        implementation.operateDevice();
    }
}
