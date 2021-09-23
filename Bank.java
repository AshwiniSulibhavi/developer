class Bank{

 public static String bankName = "BANK OF BARODA";
    
public static  int minAmount  =2000;
    
public static void allow(String[] bankBalance){
System.out.println("Checking Bank Balance");
           if(minAmount > 2000){
   System.out.println("minAmount is Satisfied");
          if(null!= bankBalance){
           getbankDetails(bankBalance);
           System.out.println("bank balance is more then minAmount");
           }
           else{
      System.out.println("not having minAmount");
         }

         }
         else{
   System.out.println("Please maintain min Balance of 2000 ");
          }
   System.out.println("checked bank Balance");
     }
 public static void getbankDetails(String[] bankBalance){
 for(int i=0;i< bankBalance.length;i++){
 System.out.println(bankBalance[i]);
}

}

}
