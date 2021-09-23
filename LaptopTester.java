class LaptopTester{

public static void main (String args[]){

Laptop laptop= new Laptop();
  
laptop.name="Lenovo";
laptop.price=30000;

System.out.println(laptop.name+" "+laptop.price);
laptop.use();


Laptop laptop1= new Laptop();
  
laptop1.name="HP";
laptop1.price=50000;

System.out.println(laptop1.name+" "+laptop1.price);
laptop1.use();

Laptop laptop2= new Laptop();
  
laptop2.name="Dell";
laptop2.price=40000;

System.out.println(laptop2.name+" "+laptop2.price);
laptop2.use();


}
}