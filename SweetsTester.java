class SweetsTester{

public static void main(String arg[]){

Sweets sweets=new Sweets();
sweets.name="Gulam jamun";
sweets.price=100;
sweets.color="red";

System.out.println(sweets.name+" "+sweets.price+" "+sweets.color);
 sweets.eat();


Sweets sweets1=new Sweets();
sweets1.name="Rasmalai";
sweets1.price=200;
sweets1.color="light yellow";

System.out.println(sweets1.name+" "+sweets1.price+" "+sweets1.color);
 sweets1.eat();


Sweets sweets2=new Sweets();
sweets2.name="Gajar Ka Halwa";
sweets2.price=100;
sweets2.color="Orange";

System.out.println(sweets2.name+" "+sweets2.price+" "+sweets2.color);
 sweets2.eat();

}
}