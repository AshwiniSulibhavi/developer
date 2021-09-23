class ApplicationTester{

public static void main(String args[]){

Application application=new Application();

application.name="mobile";
application.price=25000;

System.out.println(application.name+" "+application.price);

application.use();


Application application1=new Application();

application1.name=" Whirlpool Fridge";
application1.price=30000;

System.out.println(application1.name+" "+application1.price);

application1.use();



Application application2=new Application();

application2.name="Washing Machine";
application2.price=28000;

System.out.println(application2.name+" "+application2.price);

application2.use();

}
}