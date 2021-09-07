class Airports4f{


 static String airportsInBanglore []=new String[4];

public static void main(String a[]){

airportsInBanglore [0]="Kempegowda International Airport";
airportsInBanglore [1]="Hindustan Aeronautics Limited Airport";
airportsInBanglore [2]="jakkur Airport";
airportsInBanglore [3]="HAL Airport";
getairportsInBanglore();
}

public static void getairportsInBanglore(){
System.out.println(airportsInBanglore.length);

for( int m=0;m<airportsInBanglore.length;m++){

 System.out.println(airportsInBanglore[m]);
}

}
}