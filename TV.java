package ro.ItSchool.incapsulation.TV;

public class TV {

    public int channel = 1;
    public int volume = 0;
    boolean on = false;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 100) {
            this.channel = channel;
        }
    }

    public void channelUp(){
        if(on && channel <= 100){
            channel++;
        }
    }

    public void channelDown(){
        if(on && channel >= 1){
            channel--;
        }
    }


    public void setVolume(int volume){
        if(on && volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }


    public void volumeUp(){
        if(on && volume <=50){
            volume++;
        }
    }

    public void volumeDown(){
        if(on && volume >= 1){
            volume--;
        }
    }




}