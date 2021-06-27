import java.util.Arrays;

public class TV {
    private String name;

    //массив для хранения каналов
    private Channel[] channels;
    private int channelsCount;
    private int capacityForChannel = 5;

    public TV(String name) {
        this.name = name;
        this.channels = new Channel[capacityForChannel];
    }

    public void addChannel(Channel channel) {
        if (channelsCount >= capacityForChannel) {
            capacityForChannel = capacityForChannel + capacityForChannel / 2;
            channels = Arrays.copyOf(channels, capacityForChannel);
        }
        channels[channelsCount] = channel;
        ++channelsCount;
    }

    public void showChannelWithRandomPgm(int number) {
        if (number < 0 || number >= channelsCount) {
            System.err.println("Канала " + number + " не существует");
        }
        Channel channel = channels[number];
        System.out.print("На канале " + channel.getName() + " ");
        channel.randomProgram();
    }
}
