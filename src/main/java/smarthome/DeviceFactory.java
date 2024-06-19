package smarthome;

public interface DeviceFactory {
    Light createLight();
    Thermostat createThermostat();
    DoorLock createDoorLock();
}
