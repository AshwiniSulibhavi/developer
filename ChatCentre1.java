class ChatCentre1{


String centreName;
int centreId;
String location;
String ownerName;
boolean isOpen;
String items[]={"Pani Puri","Kachori","Samosa","Pav Bhaji","Sandwich","Vada Pav","Gobi","Shev Puri","Dahi Puri","Masala Puri"};

public ChatCentre1(){

this("Sai Chats","near KLE ground",2,"Ranganath",true);

System.out.println("chat centre object is created");
}



public ChatCentre1(String centreName,String location,int centreId, String ownerName, boolean isOpen){

this.centreName=centreName;
this.location=location;
this.items=items;
this.centreId=centreId;
this.ownerName=ownerName;
this.isOpen=isOpen;


}
public void displayChatCentre(){

System.out.println(this.centreName+" "+this.location+" "+this.isOpen+" "+this.ownerName+" "+this.centreId);
}
public void getitems(){
for(int i=0;i<this.items.length;i++){

System.out.println(this.items[i]);
}








}
}
