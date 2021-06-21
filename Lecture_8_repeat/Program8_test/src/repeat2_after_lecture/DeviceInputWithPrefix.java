package repeat2_after_lecture;

public class DeviceInputWithPrefix implements DeviceInput {

    private DeviceInput deviceInput;
    private String prefix;

    public DeviceInputWithPrefix(String prefix, DeviceInput deviceInput) {
        this.prefix = prefix;
        this.deviceInput = deviceInput;
    }

   @Override
    public String read() {
        return prefix + ": " + deviceInput.read();
    }

    @Override
    public String getInformation() {
        return "Реализация входного устройства с префиксом!";
    }

}
