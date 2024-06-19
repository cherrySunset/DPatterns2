package smarthome;

public abstract class Device {
    protected DeviceImplementation implementation;

    protected Device(DeviceImplementation implementation) {
        this.implementation = implementation;
    }

    public abstract void operate();
}

