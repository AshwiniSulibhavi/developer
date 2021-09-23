class SpeakerUtil{

public static void main(String[] arg){


boolean isConnected=Speaker.onOrOff();

System.out.println("Speaker is connected"+isConnected);

Speaker.increaseVolume();

Speaker.increaseVolume();

Speaker.increaseVolume();

Speaker.decreaseVolume();

Speaker.decreaseVolume();

Speaker.decreaseVolume();


}
}