class IccTeamsTester{

public static void main(String args[]){

IccTeams  iccteams=new IccTeams();

iccteams.teamNames="India national cricket team";
iccteams.noOfTeams=4;

System.out.println(iccteams.teamNames+" "+iccteams.noOfTeams);

iccteams.match();
}
}