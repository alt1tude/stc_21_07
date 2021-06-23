public class TV {
    private static final int MAX_TV_CHANNEL = 10;

    //массив для хранения каналов
    private Channel[] channels;
    private int channelsCount;

    private RemoteController remoteController; // ссылка на пульт

    private void useRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
        //синхронизировались с пультом
        remoteController.setTv(this);
    }

    public TV(Channel channels) {
        this.channels = new Channel[MAX_TV_CHANNEL];
    }

    public void addChannel(Channel channel) {
        if(channelsCount < MAX_TV_CHANNEL) {
            channels[channelsCount] = channel;
            ++channelsCount;
        } else {
            System.out.println("Кончились кнопки на пульте");
        }
    }

    public void getRandomProgram() {

    }

}
