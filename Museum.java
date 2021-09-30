class Museum{

String name;
String type;
String location;
int   entryFees;
String timming;
boolean isOpen;
String objects[]={"paintings","Sculpture","music","etc"};


public Museum(){

this("Ventappa art gallery","Art museum","Kasturba road",10,"10Am-5PM",true);


System.out.println("Museum object is created");
}


public Museum(String name,String type,String location,int entryFees,String timming,boolean isOpen){

this.name=name;
this.type=type;
this.location=location;
this.entryFees=entryFees;
this.timming=timming;
this.isOpen=isOpen;

}


public void displayMuseum(){

System.out.println(this.name+" "+this.type+" "+this.location+" "+this.entryFees+" "+this.timming+" "+this.isOpen);
}


public void getobjects(){

for(int m=0;m<this.objects.length;m++){

System.out.println(this.objects[m]);
}
}
}
