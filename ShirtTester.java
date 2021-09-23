class ShirtTester{

public static void main(String args[]){

Shirt shirt=new Shirt();

shirt.shirtName="Tommy Hilifiger";
shirt.color="white";
shirt.price=2250;

System.out.println(shirt.shirtName+" "+shirt.color+" "+shirt.price);
shirt.wear();


Shirt shirt1=new Shirt();

shirt1.shirtName="Tommy Hilifiger";
shirt1.color="Black";
shirt.price=4000;

System.out.println(shirt1.shirtName+" "+shirt1.color+" "+shirt1.price);
shirt1.wear();



Shirt shirt2=new Shirt();

shirt2.shirtName="Tommy Hilifiger";
shirt2.color="Brown";
shirt2.price=2500;

System.out.println(shirt2.shirtName+" "+shirt2.color+" "+shirt2.price);
shirt2.wear();


}
}