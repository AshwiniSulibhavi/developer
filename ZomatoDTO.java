public class ZomatoDTO{

public ZomatoDTO(){
System.out.println("ZomatoDTO object is created ");
}

private String shopName;
private String dishName;
private int     price;
private String place;
private String type;
private boolean isOpen;
private String timmings;


public String getShopName(){
return shopName;
}

public void setShopName(String ShopName){
this.shopName=shopName;
}

public String getDishName(){
return dishName;
}

public void setDishName(String dishName){
this.dishName=dishName;
}

public int  getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;
}

public String getPlace(){
return place;
}
public void setPlace(String place){
this.place=place;
}
public String getType(){
return type;
}
public void setType(String type){
this.type=type;
}


public boolean getIsOpen(){
return isOpen;
}
public void setIsOpen(boolean isOpen){
this.isOpen=isOpen;
}
public String getTimmings(){
return timmings;
}
public void setTimmings(String timmings){
this.timmings=timmings;
}
}


 
