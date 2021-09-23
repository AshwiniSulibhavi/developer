class MusicalInstUtil{

public static void main(String args[]){
MusicalInstruments music=new MusicalInstruments();

music.name="Guitar";
music.price=20,000;
music.frequency"20 Hz";
music.type="western";

System.out.println(music.name+" "+music.price+" "+ music.frequency+" "+music.type);

music.play(music.name);


}
}