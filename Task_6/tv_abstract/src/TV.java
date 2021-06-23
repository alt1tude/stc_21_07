import java.util.concurrent.ThreadLocalRandom;

public class TV {
    private static final int MAX_TV_CHANNEL = 5;

    private String name;

    //массив для хранения каналов
    private Channel[] channels;
    private int channelsCount;

    private RemoteController remoteController; // ссылка на пульт

    public void setRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public TV(String name) {
        this.name = name;
        this.channels = new Channel[MAX_TV_CHANNEL];
    }

    public void addChannel(Channel channel) {
        if(channelsCount < MAX_TV_CHANNEL) {
            channels[channelsCount] = channel;
            ++channelsCount;
            System.out.println();
        } else {
            System.err.println("Кончились кнопки на пульте");
        }
    }

    public Channel getChannelRandomPgm() {
//        return channels[ThreadLocalRandom.current().nextInt(channelsCount)];
    }

}
