class ShoeTester{

public static void main(String arg[]){
Shoe shoe=new Shoe();

shoe.name=" Bata Sports shoe";
shoe.price=2000;
shoe.color="Black";

System.out.println(shoe.name+" "+shoe.price+" "+shoe.color);
shoe.wear();


Shoe shoe1=new Shoe();

shoe1.name=" Adidas shoe";
shoe1.price=4000;
shoe1.color="pink";

System.out.println(shoe1.name+" "+shoe1.price+" "+shoe1.color);
shoe1.wear();


Shoe shoe2=new Shoe();

shoe2.name="Nike shoe";
shoe2.price=3500;
shoe2.color="White";

System.out.println(shoe2.name+" "+shoe2.price+" "+shoe2.color);
shoe2.wear();



}
}