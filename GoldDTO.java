public class GoldDTO{

public GoldDTO(){
System.out.println("GoldDto object is created");
}

private String shopName;
private String  item;
private  long    price;
private String  location;
private String  ownerName;

public String getShopName(){
return shopName;
}

public void setShopName(String shopName){
this.shopName=shopName;
}

public String getItem(){
return item;
}

public void setItem(String item){
this.item=item;
}

public  long getPrice(){
return price;
}
public void setPrice(long price){
this.price=price;
}

public String getLocation(){
return location;
}
public void setLocation(String location){
this.location=location;
}

public String getOwnerName(){
return ownerName;
}
public void setOwnerName(String ownerName){
this.ownerName=ownerName;
}
}

 
