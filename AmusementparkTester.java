class AmusementparkTester{

public static void main(String args[]){

Amusementpark amusementpark=new Amusementpark();

amusementpark.parkName="Essel World";
amusementpark.entryFees=2000;
amusementpark.placeName="India";

System.out.println(amusementpark.parkName+" "+amusementpark.entryFees+" "+amusementpark.placeName);

amusementpark.travel();


Amusementpark amusementpark1=new Amusementpark();
amusementpark1.parkName="Fun World water park";
amusementpark1.entryFees=1000;
amusementpark1.placeName="Banglore";

System.out.println(amusementpark1.parkName+" "+amusementpark1.entryFees+" "+amusementpark1.placeName);

amusementpark1.travel();


Amusementpark amusementpark2=new Amusementpark();
amusementpark2.parkName="Water Kingdom";
amusementpark2.entryFees=3000;
amusementpark2.placeName="Mumbai";

System.out.println(amusementpark2.parkName+" "+amusementpark2.entryFees+" "+amusementpark2.placeName);

amusementpark2.travel();




}
}