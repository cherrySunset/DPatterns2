package smarthome;

public class ThermostatDevice extends Device{
    public ThermostatDevice(DeviceImplementation implementation) {
        super(implementation);
    }

    @Override
    public void operate() {
        implementation.operateDevice();
    }
}
