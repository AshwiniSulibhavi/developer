class ChocolateTester{

public static void main(String arg[]){
Chocolate chocolate =new Chocolate();


chocolate.chocolateName="Dairy Milk";
chocolate.chocolatePrice=100;


System.out.println(chocolate.chocolateName+" "+chocolate.chocolatePrice);

chocolate.Eat();


Chocolate chocolate1 =new Chocolate();


chocolate1.chocolateName="Kitkat";
chocolate1.chocolatePrice=80;


System.out.println(chocolate1.chocolateName+" "+chocolate1.chocolatePrice);

chocolate1.Eat();


Chocolate chocolate2=new Chocolate();


chocolate2.chocolateName="Hersheys";
chocolate2.chocolatePrice=200;


System.out.println(chocolate2.chocolateName+" "+chocolate2.chocolatePrice);

chocolate2.Eat();



}
}