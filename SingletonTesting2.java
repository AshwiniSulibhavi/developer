class SingletonTesting2{

public static void main(String a[]){


Duster duster= Duster.getDuster();
System.out.println(duster);

Duster duster1 = Duster.getDuster();
System.out.println(duster1);


Duster chalk=new Duster();
System.out.println(chalk);
Duster eraser=new Duster();
System.out.println(eraser);
}
}