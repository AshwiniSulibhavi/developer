class IcecreamTester{

public static void main(String args[]){

Icecream icecream=new Icecream();

icecream.name="chocolate Cone icecream";
icecream.color="brown";
icecream.quantity=2;
icecream.price=140;

System.out.println(icecream.name+" "+icecream.color+" "+icecream.quantity+" "+icecream.price);
icecream.eat();

Icecream icecream1=new Icecream();

icecream1.name="banana Nut Fudge ";
icecream1.color="white";
icecream1.quantity=1;
icecream1.price=250;

System.out.println(icecream1.name+" "+icecream1.color+" "+icecream1.quantity+" "+icecream1.price);
icecream1.eat();


Icecream icecream2=new Icecream();

icecream2.name="Burgundy Cherry icecream";
icecream2.color="light purple";
icecream2.quantity=2;
icecream2.price=400;

System.out.println(icecream2.name+" "+icecream2.color+" "+icecream2.quantity+" "+icecream2.price);
icecream2.eat();


}
}