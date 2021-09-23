class ExamAllow{

 public static String universityName = "VTU";
    
public static  int fees  =1001;
    
public static void allow(String[] hallTicket){
System.out.println("Inside allow method");
           
   
          if(null!= hallTicket){
           getHallTicketDetails(hallTicket);
           System.out.println("Allowed to write Exam");
           }
           else{
      System.out.println("No Hallticket Found");
}
System.out.println("end of allow method with hallticket");

}

public static void allow(int fees){

System.out.println("Start of allow method with fees");
if(fees > 1000){System.out.println(fees);
}
else {


         

   System.out.println("Please pay the fees");
          }
   System.out.println("end of  allow method with fees");
     }
 public static void getHallTicketDetails(String[] hallTicket){
 for(int i=0 ; i  < hallTicket.length;i++){
 System.out.println(hallTicket[i]);
}

}

}
