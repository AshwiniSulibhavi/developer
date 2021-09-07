class Exam{
      public static String universityName="VTU";
 public static String[] hallTicket{"Ramdev Bada","PATA2006AY001",Home Products};
public int fees=1350;


public static boolean allow( string[] hallTicket){

boolean allowedToWriteExam=false;
if( fees>1000){
           if(hallTicket!=null){
          allowedToWriteExam=True;
          gethallTicket();
          return allowedToWriteExam;

  }
       else{
             System.out.println("No hallTicket!!! cannot allow to write exam");
  }
  
       else{
          System.out.println("Gube......Please pay the fees");
}
        return allowedToWriteExam;

public static void gethallTicket(String[] hallTicket){
for(int i=0;i<hallTicket.length;i++){
System.out.println(hallTicket[i]);
}
}
}
