class ShoppingMalls4f{


 static String ShoppingMallNames []=new String[7];

public static void main(String a[]){

ShoppingMallNames[0]="Mantri Square Mall";
ShoppingMallNames[1]="Orion Mall";
ShoppingMallNames[2]="Garuda Mall";
ShoppingMallNames[3]="Phonenix marketcity";
ShoppingMallNames[4]="Coupon Mall";
ShoppingMallNames[5]="Forum Mall";
ShoppingMallNames[6]="Global Mall";
getShoppingMallNames();
}
public static void getShoppingMallNames(){
System.out.println(ShoppingMallNames.length);


for(int g=0;g<ShoppingMallNames.length;g++){

 System.out.println(ShoppingMallNames[g]);
}
 

}
}