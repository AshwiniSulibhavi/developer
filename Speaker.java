class Speaker{

   static String name="Boat";
   static int minVolume=0;

   static int maxVolume=15;

   static boolean isConnected=false;
   static int currentVolume;

public static boolean onOrOff(){

             if(isConnected==false){
                    isConnected=true;
                    return isConnected;
                                    }
            else{
                   return isConnected;
                }
                                }

public static void increaseVolume(){
System.out.println("inside increaseVolume()");


if(isConnected){
if(currentVolume<maxVolume){
currentVolume=currentVolume+1;
System.out.println("the current volume is:"+currentVolume);
}
else{

   System.out.println("MaxVolume Reached");
}
}
System.out.println("End of increaseVolume()");
}

public static void decreaseVolume(){
System.out.println("inside decreaseVolume()");

if(isConnected){
if(currentVolume>minVolume){
currentVolume=currentVolume-1;
System.out.println("the current volume is:"+currentVolume);
}
else{

System.out.println("minVolume Reached");
}
}
System.out.println("End of decreaseVolume()");
}                                       
}