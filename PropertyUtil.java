class PropertyUtil{


public static void main(String a[]){

PropertyDTO p = new PropertyDTO();

p.setHolderName("Mahantesh Kori");
p.setArea("1171.0 sq.ft- 1217.0 sq.ft");
p.setPrice("77014Lac to 79.9 Lac");
p.setLocation("In Yelahanka,Banglore North");
p.setDetail("Mahaveer Celesse offers 2BHK apartments ");


System.out.println(p.getHolderName()+"       "+p.getArea()+"        "+p.getPrice()+"      "+p.getLocation()+"        "+p.getDetail());
}
}