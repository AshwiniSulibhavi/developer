public class PropertyDTO{

public PropertyDTO(){
System.out.println("PropertyDTO object is created");
}

private String holderName;
private String area;
private String price;
private String location;
private String detail;

public String getHolderName(){
return holderName;
}

public void setHolderName(String holderName){
this.holderName=holderName;
}

public String getArea(){
return area;
}

public void setArea(String area){
this.area=area;
}

public  String getPrice(){
return price;
}
public void setPrice(String price){
this.price=price;
}

public String getLocation(){
return location;
}
public void setLocation(String location){
this.location=location;
}

public String getDetail(){
return detail;
}
public void setDetail(String detail){
this.detail=detail;
}
}

 
