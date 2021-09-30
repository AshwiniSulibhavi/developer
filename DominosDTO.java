public class DominosDTO{

public DominosDTO(){
System.out.println(" Dominos object is created");
}

private String item;
private int amount;
private int orderNumber;
private String  deliveryLocation;

public String getItem(){
return item;
}

public void setItem(String item){
this.item=item;
}

public int getAmount(){
return amount;
}

public void setAmount(int amount){
this.amount=amount;
}

public  int getOrderNumber(){
return orderNumber;
}
public void setOrderNumber(int orderNumber){
this.orderNumber=orderNumber;
}

public String getDeliveryLocation(){
return deliveryLocation;
}
public void setDeliveryLocation(String deliveryLocation){
this.deliveryLocation=deliveryLocation;
}

}