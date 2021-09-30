class ZomatoUtil{


public static void main(String a[]){

ZomatoDTO dom= new ZomatoDTO();

dom.setShopName("Punjabi Nawabi");
dom.setDishName("Rajma with Steamed Rice ");
dom.setPrice(180);
dom.setPlace("Rajajinagar,Banglore");
dom.setType("veg");
dom.setIsOpen(true);
dom.setTimmings("9am-9pm");

System.out.println(dom.getShopName()+"     "+dom.getDishName()+"     "+dom.getPrice()+"      "+dom.getPlace()+"    "+dom.getType()+"     "+dom.getIsOpen()+"    "+dom.getTimmings());
}
}