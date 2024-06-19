package smarthome;

public class Main {
    public static void main(String[] args) {
            DeviceFactory factory = new HomeDeviceFactory();
            SmartHomeController controller = new SmartHomeController(factory);

            controller.turnOnDevices();

            controller.operateThermostat();

            controller.lockDoors();

            controller.turnOffDevices();
    }
}
