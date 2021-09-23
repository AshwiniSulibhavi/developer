class Election{

 public static String candidateName = "yadiyurappa";
    
public static int  totalVotes=10000;
    
public static void allow(String[] voterId){
System.out.println("Election Voting Started");
           if(totalVotes >50000 ){
   System.out.println("Election Vote Counting");
          if(null!=voterId){
           getVoterIdDetails(voterId);
           System.out.println("Allowed to vote");
           }
           else{
      System.out.println("Not allowed to vote");
         }

         }
         else{
   System.out.println("To vote ,should be more than 18 years old");
          }
   System.out.println("End of Election");
     }
 public static void getVoterIdDetails(String[] voterId){
 for(int i=0 ; i<voterId.length;i++){
 System.out.println(voterId[i]);
}

}

}
