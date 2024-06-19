package smarthome;

public class HomeDeviceFactory implements DeviceFactory {

    @Override
    public Light createLight() {
        return new HomeLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new HomeThermostat();
    }

    @Override
    public DoorLock createDoorLock() {
        return new HomeDoorLock();
    }
}
