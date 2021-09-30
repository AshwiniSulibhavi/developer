class Transportation{

String name;
String busNumber;
int distanceInKm;
int price;
String location;
boolean isSafe;
String busStops[]={"majestic","Chandra Layout","Electronic City","Srinagara","Vidyaranyapura","Shivajinagara bus sstation","Nagarabhavi BDA Complex","Yeshwantpura"};


public  Transportation(){
this("Bus","96G",15,20,"Harishchandra Ghat",true);

System.out.println("Transportation object is created");
}


public Transportation(String name,String busNumber,int distanceInKm,int price,String location,boolean isSafe){

this.name=name;
this.busNumber=busNumber;
this.location=location;
this.distanceInKm=distanceInKm;
this.price=price;
this.isSafe=isSafe;
this.busStops=busStops;
}


public void displayTransportation(){

System.out.println(this.name+" "+this.busNumber+" "+this.location+" "+this.distanceInKm+" "+this.price+" "+this.isSafe);
}


public void getbusStops(){

for(int y=0;y<this.busStops.length;y++){
System.out.println(this.busStops[y]);
}
}
}

