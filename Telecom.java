class Telecom{

 public static String telecommunicationCompanyName = "Airtel Ltd";
    
public static int  rechargeForUpTo = 56 ;
    
public static void allow(String[] dataPackAndTalktime){
System.out.println("Recharging Airtel SIM");
           if(rechargeForUpTo < 56 ){
   System.out.println("Airtel Pack is going to expire");
          if(null!=dataPackAndTalktime){
           getrechargingDetails(dataPackAndTalktime);
           System.out.println("Airtel Pack is Valid");
           }
           else{
      System.out.println("Your Airtel Pack is Expired");
         }

         }
         else{
   System.out.println("RENEW YOUR PACK!Recharge with any unlimited pack to continue services");
          }
   System.out.println("RECHARGE IS SUCCESSFUL");
     }
 public static void getrechargingDetails(String[] dataPackAndTalktime){
 for(int i=0 ; i<dataPackAndTalktime.length;i++){
 System.out.println(dataPackAndTalktime[i]);
}

}

}
