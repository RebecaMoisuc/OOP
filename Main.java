package ro.ItSchool.incapsulation.TV;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(10);
        tv.setVolume(5);

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.channelDown();
        tv1.volumeDown();

        System.out.println("TV channel is: " + tv.channel + " and volume level is: " + tv.volume);
        System.out.println("TV1 channel is: " + tv1.channel + " and volume level is: " + tv1.volume);
    }

}
