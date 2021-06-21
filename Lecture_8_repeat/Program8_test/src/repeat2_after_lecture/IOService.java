package repeat2_after_lecture;

public class IOService {
    private DeviceInput deviceInput;
    private DeviceOutput deviceOutput;

    public IOService(DeviceInput deviceInput, DeviceOutput deviceOutput) {
        this.deviceInput = deviceInput;
        this.deviceOutput = deviceOutput;
    }

    public void print(String message) {
       deviceOutput.write(message);
    }

    public String read() {
       return deviceInput.read();
    }

    public void printDeviceInformation() {
        System.out.println(deviceInput.getInformation());
        System.out.println(deviceOutput.getInformation());
    }

}
