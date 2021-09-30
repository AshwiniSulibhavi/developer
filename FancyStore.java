class FancyStore{


String storeName;
int storeId;
String location;
String ownerName;
boolean isOpen;
String items[]={"Necklace","Ear-rings","Finger ring","Anklets","Bangels","nailpolish","hairbands","Lipstick","Foundations","Bindi's"};


public  FancyStore(){
this("Lavanya",122,"guledgudd","Ashwini",true);

System.out.println("Fancy Store object is created");
}


public FancyStore(String storeName,int storeId,String location,String ownerName,boolean isOpen){

this.storeName=storeName;
this.storeId=storeId;
this.location=location;
this.ownerName=ownerName;
this.isOpen=isOpen;
this.items=items;
}


public void displayFancyStore(){

System.out.println(this.storeName+" "+this.storeId+" "+this.location+" "+this.isOpen);
}


public void getItems(){

for(int y=0;y<this.items.length;y++){
System.out.println(this.items[y]);
}
}
}

