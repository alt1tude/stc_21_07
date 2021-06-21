package repeat2_after_lecture;

import java.time.LocalTime;

public class DeviceInputWithTime implements DeviceInput {

    private DeviceInput deviceInput;

    public DeviceInputWithTime(DeviceInput deviceInput) {
        this.deviceInput = deviceInput;
    }

    @Override
    public String read() {
        return LocalTime.now() + ": " + deviceInput.read();
    }


    @Override
    public String getInformation() {
        return "Реализация входного устройства со временем";
    }


}
