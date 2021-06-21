package repeat2_after_lecture;



public class Main {
    public static void main(String[] args) {
        DeviceInput scannerDevice = new DeviceInputScannerImpl();
        DeviceInput prefixDevice = new DeviceInputWithPrefix("Сообщение", scannerDevice);
        DeviceInput timeDevice = new DeviceInputWithTime(prefixDevice);

        DeviceOutput deviceOutput = new DeviceOutputErrorImpl();

        String message = timeDevice.read();
        deviceOutput.write(message);

    }
}
