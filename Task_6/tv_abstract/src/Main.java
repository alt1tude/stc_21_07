public class Main {

    public static void main(String[] args) {
        TV tv = new TV("Toshiba");
        RemoteController remoteController = new RemoteController("RC-Toshiba");

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

        //добавили все программы в канал Discovery
        for(int i = 0; i < programs.length; ++i) {
            channel5.addProgram(programs[i]);
        }

        //получаем рандомную программу с канала Discovery
        for(int i = 0; i < programs.length; ++i) {
            System.out.println(channel5.randomProgram().getName());
        }

        channel5.printProgram(channel5.getName(), program1);

        tv.addChannel(channel1);
        tv.addChannel(channel2);
        tv.addChannel(channel3);
        tv.addChannel(channel4);
        tv.addChannel(channel5);

        System.out.println(tv.getChannelRandomPgm().getName());

    }
}
