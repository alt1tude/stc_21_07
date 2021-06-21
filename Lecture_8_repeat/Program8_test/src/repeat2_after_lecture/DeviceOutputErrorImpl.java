package repeat2_after_lecture;

public class DeviceOutputErrorImpl implements DeviceOutput {

    @Override
    public void write(String message) {
        System.err.println(message);
    }

    @Override
    public String getInformation() {
        return "Реализация вывода сообщения с помощью System.err-потока";
    }
}
