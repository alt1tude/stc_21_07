public class RemoteController {
    private String name;

    private TV tv; // ссылка на тв
    private Channel channel;

    public RemoteController(String name, TV tv) {
        this.name = name;
        this.tv = tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void showChannelWithNumber(int number) {
        tv.showChannelWithRandomPgm(number);
    }

}
