class WatchFactory4{

public static void main(String a[]){


String watchCompanyNames []=new String[8];
watchCompanyNames[0]="Titan";
watchCompanyNames [1]="Casio";
watchCompanyNames [2]="Timex";
watchCompanyNames[3]="Fastrack";
watchCompanyNames [4]="Giordano";
watchCompanyNames[5]="Rado";
watchCompanyNames [6]="Maxima";
watchCompanyNames[7]="Swatch";
    

String typesOfRadoWatches []=new String[7];
typesOfRadoWatches [0]="RADO Captain Cook Automatic";
typesOfRadoWatches [1]="RADO Captain Cook Automatic Bronze";
typesOfRadoWatches [2]="RADO Centrix";
typesOfRadoWatches [3]="RADO Centrix Men Open Heart";
typesOfRadoWatches [4]="Centrix Open Heart";
typesOfRadoWatches [5]="RADO Ceramica";
typesOfRadoWatches [6]="RADO Coupole";


for (int s=0;s<watchCompanyNames.length;s++){

 System.out.println(watchCompanyNames[s]);
}

for(int l=0;l<typesOfRadoWatches.length;l++){
 System.out.println(typesOfRadoWatches[l]);
}

}
}