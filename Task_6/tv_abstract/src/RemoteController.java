public class RemoteController {
    private String name;

    public RemoteController(String name) {
        this.name = name;
    }

    private TV tv; // ссылка на тв

    public void tvOn(TV tv) {
        this.tv = tv;
        //пульт запоминает свой телевизор
        tv.setRemoteController(this);
    }

    private void getChannelNumber() {

    }

}
