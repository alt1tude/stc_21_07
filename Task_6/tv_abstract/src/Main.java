public class Main {

    public static void main(String[] args) {
        TV tv = new TV("Toshiba");
        RemoteController remoteController = new RemoteController("RC-Toshiba", tv);

        Program program1 = new Program("Махинаторы");
        Program program2 = new Program("Как_это_устроено?");
        Program program3 = new Program("Голые_и_напуганные");
        Program program4 = new Program("Золотая_лихорадка");
        Program program5 = new Program("Разрушители_легенд");

        Program[] programs = {program1, program2, program3, program4, program5};

        Channel channel1 = new Channel("НТВ");
        Channel channel2 = new Channel("TNT");
        Channel channel3 = new Channel("Первый канал");
        Channel channel4 = new Channel("Че");
        Channel channel5 = new Channel("Discovery");

        Channel[] channels = {channel1, channel2, channel3, channel4, channel5};

        //добавили все программы в канал Discovery
        for (int i = 0; i < programs.length; ++i) {
            channel5.addProgram(programs[i]);
        }

        //получаем рандомную программу с канала Discovery
        //в других каналах пока нет программ, выводится только System.err-поток
        channel5.randomProgram();
        System.out.println("-----");
        //добавили все каналы в ТВ
        for (int i = 0; i < channels.length; ++i) {
            tv.addChannel(channels[i]);
        }

        //обращаемся к конкретному каналу ТВ (Discovery), для показа случайной программы
        //в других каналах пока нет программ, выводится только System.err-поток
        tv.showChannelWithRandomPgm(4);
        System.out.println("+++++");
        remoteController.showChannelWithNumber(4);
    }
}
