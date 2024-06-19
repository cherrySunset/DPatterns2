package smarthome;

import smarthome.State.*;

public class SmartHomeController {
    private Device light;
    private Device thermostat;
    private Device doorLock;
    private DeviceState onState;
    private DeviceState offState;
    private DeviceState lockedState;
    private DeviceState unlockedState;
    private DeviceState currentState;

    public SmartHomeController(DeviceFactory factory) {
        this.light = new LightDevice((DeviceImplementation) factory.createLight());
        this.thermostat = new ThermostatDevice((DeviceImplementation) factory.createThermostat());
        this.doorLock = new DoorLockDevice((DeviceImplementation) factory.createDoorLock());

        this.onState = new OnState();
        this.offState = new OffState();
        this.lockedState = new LockedState();
        this.unlockedState = new UnlockedState();

        this.currentState = offState;
    }

    public void setState(DeviceState state) {
        this.currentState = state;
    }

    public void operateLight() {
        currentState.handle();
        light.operate();
    }

    public void operateThermostat() {
        currentState.handle();
        thermostat.operate();
    }

    public void operateDoorLock() {
        currentState.handle();
        doorLock.operate();
    }

    public void turnOnDevices() {
        setState(onState);
        operateLight();
        operateThermostat();
        operateDoorLock();
    }

    public void turnOffDevices() {
        setState(offState);
        operateLight();
        operateThermostat();
        operateDoorLock();
    }

    public void lockDoors() {
        setState(lockedState);
        operateDoorLock();
    }

    public void unlockDoors() {
        setState(unlockedState);
        operateDoorLock();
    }
}
