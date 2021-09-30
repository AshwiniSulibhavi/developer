class DominosUtil{


public static void main(String a[]){

DominosDTO dom= new DominosDTO();

dom.setItem("Creamy Tomato Pasta Pizza");
dom.setAmount(399);
dom.setOrderNumber(89);
dom.setDeliveryLocation("2nd Stage,Rajajinagar,Banglore");

System.out.println(dom.getItem()+"     "+dom.getAmount()+"     "+dom.getOrderNumber()+"      "+dom.getDeliveryLocation());
}
}