class Appliances{


String name;
int price;
String location;
String modelNumber;
int kG;

String brands[]={"LG","Hairer","IFB Eva Aqua VX","Samsung","Whirpool","Panasonic","BOSCH","Godrej"};


public Appliances(){
this("Washing Machine",30000,"Banglore","Lg FH0B8NDL22 Fully Automatic",6);

}


public Appliances(String name,int price,String location,String modelNumber,int kG){

this.name=name;
this.price=price;
this.location=location;
this.modelNumber=modelNumber;
this.kG=kG;
this.brands=brands;

}


public void displayAppliances(){

System.out.println(this.name+" "+this.price+" "+this.location+" "+this.modelNumber+" "+this.kG);
}


public void getbrands(){

for(int o=0;o<this.brands.length;o++){

System.out.println(this.brands[o]);
}
}
}
