package repeat2_after_lecture;

public class Main1 {
    public static void main(String[] args) {
        DeviceInput scannerDevice = new DeviceInputScannerImpl();
        DeviceInput prefixDevice = new DeviceInputWithPrefix("Сообщение", scannerDevice);
        DeviceInput timeDevice = new DeviceInputWithTime(prefixDevice);
        DeviceOutput deviceOutput = new DeviceOutputErrorImpl();
        DeviceOutput standartOutput = new DeviceOutputStandarImpl();

        IOService service = new IOService(timeDevice, standartOutput);

        service.printDeviceInformation();

        while (true) {
            String message = service.read();
            service.print(message);
        }

    }
}
