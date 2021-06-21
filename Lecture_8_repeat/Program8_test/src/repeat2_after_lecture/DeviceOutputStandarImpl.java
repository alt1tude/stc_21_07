package repeat2_after_lecture;

public class DeviceOutputStandarImpl implements DeviceOutput {
    @Override
    public void write(String message) {
        System.out.println(message);
    }

    @Override
    public String getInformation() {
        return "Реализация вывода сообщения с помощью System.out-потока";
    }
}
